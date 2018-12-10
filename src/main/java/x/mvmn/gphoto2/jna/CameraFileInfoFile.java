package x.mvmn.gphoto2.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : /usr/local/include/gphoto2/gphoto2/gphoto2-filesys.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CameraFileInfoFile extends Structure {
	/**
	 * @see CameraFileInfoFields<br>
	 * < \brief Bitmask containing the set members.<br>
	 * C type : CameraFileInfoFields
	 */
	public int fields;
	/**
	 * @see CameraFileStatus<br>
	 * < \brief Status of the file.<br>
	 * C type : CameraFileStatus
	 */
	public int status;
	/** < \brief Size of the file. */
	public long size;
	/**
	 * < \brief MIME type of the file.<br>
	 * C type : char[64]
	 */
	public byte[] type = new byte[64];
	/** < \brief Height of the file. */
	public int width;
	/** < \brief Width of the file. */
	public int height;
	/**
	 * @see CameraFilePermissions<br>
	 * < \brief Permissions of the file.<br>
	 * C type : CameraFilePermissions
	 */
	public int permissions;
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	public CameraFileInfoFile() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("fields", "status", "size", "type", "width", "height", "permissions");
	}
	/**
	 * @param fields @see CameraFileInfoFields<br>
	 * < \brief Bitmask containing the set members.<br>
	 * C type : CameraFileInfoFields<br>
	 * @param status @see CameraFileStatus<br>
	 * < \brief Status of the file.<br>
	 * C type : CameraFileStatus<br>
	 * @param size < \brief Size of the file.<br>
	 * @param type < \brief MIME type of the file.<br>
	 * C type : char[64]<br>
	 * @param width < \brief Height of the file.<br>
	 * @param height < \brief Width of the file.<br>
	 * @param permissions @see CameraFilePermissions<br>
	 * < \brief Permissions of the file.<br>
	 * C type : CameraFilePermissions
	 */
	public CameraFileInfoFile(int fields, int status, long size, byte type[], int width, int height, int permissions) {
		super();
		this.fields = fields;
		this.status = status;
		this.size = size;
		if ((type.length != this.type.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.type = type;
		this.width = width;
		this.height = height;
		this.permissions = permissions;
	}
	public CameraFileInfoFile(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CameraFileInfoFile implements Structure.ByReference {
		
	};
	public static class ByValue extends CameraFileInfoFile implements Structure.ByValue {
		
	};
}
