package x.mvmn.gphoto2.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : /usr/local/include/gphoto2/gphoto2/gphoto2-port.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class GPPortSettingsUSB extends Structure {
	/** < \brief Bulk IN endpoint used. */
	public int inep;
	/** < \brief Bulk OUT endpoint used. */
	public int outep;
	/** < \brief Interrupt endpoint used. */
	public int intep;
	/** < \brief USB bConfigurationValue used. */
	public int config;
	/** < \brief USB Interface number used. */
	public int interface$;
	/** < \brief USB Alternative Setting used. */
	public int altsetting;
	/** < \brief Maximum USB packetsize of the IN endpoint. (r/o) */
	public int maxpacketsize;
	/**
	 * < \brief USB Portname. Specific to lowlevel USB.<br>
	 * C type : char[64]
	 */
	public byte[] port = new byte[64];
	public GPPortSettingsUSB() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("inep", "outep", "intep", "config", "interface$", "altsetting", "maxpacketsize", "port");
	}
	/**
	 * @param inep < \brief Bulk IN endpoint used.<br>
	 * @param outep < \brief Bulk OUT endpoint used.<br>
	 * @param intep < \brief Interrupt endpoint used.<br>
	 * @param config < \brief USB bConfigurationValue used.<br>
	 * @param interface$ < \brief USB Interface number used.<br>
	 * @param altsetting < \brief USB Alternative Setting used.<br>
	 * @param maxpacketsize < \brief Maximum USB packetsize of the IN endpoint. (r/o)<br>
	 * @param port < \brief USB Portname. Specific to lowlevel USB.<br>
	 * C type : char[64]
	 */
	public GPPortSettingsUSB(int inep, int outep, int intep, int config, int interface$, int altsetting, int maxpacketsize, byte port[]) {
		super();
		this.inep = inep;
		this.outep = outep;
		this.intep = intep;
		this.config = config;
		this.interface$ = interface$;
		this.altsetting = altsetting;
		this.maxpacketsize = maxpacketsize;
		if ((port.length != this.port.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.port = port;
	}
	public GPPortSettingsUSB(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends GPPortSettingsUSB implements Structure.ByReference {
		
	};
	public static class ByValue extends GPPortSettingsUSB implements Structure.ByValue {
		
	};
}