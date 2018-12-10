package x.mvmn.gphoto2.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
import x.mvmn.gphoto2.jna.Gphoto2Library.CameraFilesystemDeleteAllFunc;
import x.mvmn.gphoto2.jna.Gphoto2Library.CameraFilesystemDeleteFileFunc;
import x.mvmn.gphoto2.jna.Gphoto2Library.CameraFilesystemDirFunc;
import x.mvmn.gphoto2.jna.Gphoto2Library.CameraFilesystemGetFileFunc;
import x.mvmn.gphoto2.jna.Gphoto2Library.CameraFilesystemGetInfoFunc;
import x.mvmn.gphoto2.jna.Gphoto2Library.CameraFilesystemListFunc;
import x.mvmn.gphoto2.jna.Gphoto2Library.CameraFilesystemPutFileFunc;
import x.mvmn.gphoto2.jna.Gphoto2Library.CameraFilesystemReadFileFunc;
import x.mvmn.gphoto2.jna.Gphoto2Library.CameraFilesystemSetInfoFunc;
import x.mvmn.gphoto2.jna.Gphoto2Library.CameraFilesystemStorageInfoFunc;
/**
 * <i>native declaration : /usr/local/include/gphoto2/gphoto2/gphoto2-filesys.h:310</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CameraFilesystemFuncs extends Structure {
	/** C type : CameraFilesystemListFunc */
	public CameraFilesystemListFunc file_list_func;
	/** C type : CameraFilesystemListFunc */
	public CameraFilesystemListFunc folder_list_func;
	/** C type : CameraFilesystemPutFileFunc */
	public CameraFilesystemPutFileFunc put_file_func;
	/** C type : CameraFilesystemDeleteAllFunc */
	public CameraFilesystemDeleteAllFunc delete_all_func;
	/** C type : CameraFilesystemGetInfoFunc */
	public CameraFilesystemGetInfoFunc get_info_func;
	/** C type : CameraFilesystemSetInfoFunc */
	public CameraFilesystemSetInfoFunc set_info_func;
	/** C type : CameraFilesystemDirFunc */
	public CameraFilesystemDirFunc make_dir_func;
	/** C type : CameraFilesystemDirFunc */
	public CameraFilesystemDirFunc remove_dir_func;
	/** C type : CameraFilesystemGetFileFunc */
	public CameraFilesystemGetFileFunc get_file_func;
	/** C type : CameraFilesystemReadFileFunc */
	public CameraFilesystemReadFileFunc read_file_func;
	/** C type : CameraFilesystemDeleteFileFunc */
	public CameraFilesystemDeleteFileFunc del_file_func;
	/** C type : CameraFilesystemStorageInfoFunc */
	public CameraFilesystemStorageInfoFunc storage_info_func;
	/** C type : void*[31] */
	public Pointer[] unused = new Pointer[31];
	public CameraFilesystemFuncs() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("file_list_func", "folder_list_func", "put_file_func", "delete_all_func", "get_info_func", "set_info_func", "make_dir_func", "remove_dir_func", "get_file_func", "read_file_func", "del_file_func", "storage_info_func", "unused");
	}
	public CameraFilesystemFuncs(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CameraFilesystemFuncs implements Structure.ByReference {
		
	};
	public static class ByValue extends CameraFilesystemFuncs implements Structure.ByValue {
		
	};
}