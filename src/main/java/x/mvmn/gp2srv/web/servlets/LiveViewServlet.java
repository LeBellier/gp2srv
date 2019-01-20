package x.mvmn.gp2srv.web.servlets;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Observable;
import java.util.Observer;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import x.leBellier.photobooth.BeanSession;
import x.mvmn.gp2srv.GPhoto2Server;
import x.mvmn.log.api.Logger;

public final class LiveViewServlet extends HttpServlet implements Observer {

	private static final byte[] PREFIX;
	private static final byte[] SEPARATOR;

	static {
		byte[] prefix = null;
		byte[] separator = null;
		try {
			prefix = ("--BoundaryString\r\n" + "Content-type: image/jpeg\r\n" + "Content-Length: ").getBytes("UTF-8");
			separator = "\r\n\r\n".getBytes("UTF-8");
		} catch (UnsupportedEncodingException notGonnaHappen) {
			// Will never happen
			throw new RuntimeException(notGonnaHappen);
		}
		PREFIX = prefix;
		SEPARATOR = separator;
	}
	private static final long serialVersionUID = -6610127379314108183L;
	private static final Logger logger = BeanSession.getInstance().getLogger();

	private String staticPreviewFilePath = "";

	public LiveViewServlet() {
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GPhoto2Server.liveViewEnabled.set(false);
		try {
			GPhoto2Server.waitWhileLiveViewInProgress(50);
		} finally {
			GPhoto2Server.liveViewEnabled.set(true);
		}
		response.setContentType("multipart/x-mixed-replace; boundary=--BoundaryString");
		final OutputStream outputStream = response.getOutputStream();
		byte[] jpeg;
		while (GPhoto2Server.liveViewEnabled.get()) {
			try {
				GPhoto2Server.liveViewInProgress.set(true);
				jpeg = BeanSession.getInstance().getCameraService().capturePreview(staticPreviewFilePath);
				outputStream.write(PREFIX);
				outputStream.write(String.valueOf(jpeg.length).getBytes("UTF-8"));
				outputStream.write(SEPARATOR);
				outputStream.write(jpeg);
				outputStream.write(SEPARATOR);
				outputStream.flush();
				System.gc();
				Thread.yield();
			} catch (final EOFException e) {
				logger.error("This just means user closed preview: " + e.getClass().getName() + " " + e.getMessage());
				break;
			} catch (final Exception e) {
				e.printStackTrace();
				logger.error("Live view stopped: " + e.getClass().getName() + " " + e.getMessage());
				break;
			} finally {

				GPhoto2Server.liveViewInProgress.set(false);
			}
		}
		BeanSession.getInstance().getCameraService().releaseCamera();
	}

	public void update(Observable o, Object o1) {
		staticPreviewFilePath = (String) o1;
	}
}
