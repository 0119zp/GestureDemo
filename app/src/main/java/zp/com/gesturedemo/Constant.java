package zp.com.gesturedemo;

import android.content.Context;


/**
 * 用户存放sdk中用到的一些全局常量
 */
public class Constant {

	public static String gestureStr = "";//动态手势密码数值e

	public static String APP_VERSION = "";
	/**
	 * 加密Key
	 */
	public static String aes_key = null;
	/**
	 * 会话token
	 */
	public static String token = null;

	/**
	 * 文件服务token，为创建文件时服务端返回
	 */
	public static String FILE_SERVICE_TOKEN = "";


	/**
	 * 接口返回ares key的参数key
	 */
	public static final String AES_KEY = "skey";

	/**
	 * 接口返回会话token的key
	 */
	public static final String TOKEN = "token";
	
	/**
	 * 状态码
	 */
	public static final String STATUS = "status";


	
	/**
	 * ApplicationContext，应用上下文，app初始化时，赋值
	 */
	private static Context appContext;

	private static String uuid;


	/**
	 * 获取上下文对象
	 * @return {@link Context}
	 */
	public static Context getAppContext() {
		return appContext;
	}

	/**
	 * 设置上下文对象
	 * @param appContext {@link Context}
	 */
	public static void setAppContext(Context appContext) {
		Constant.appContext = appContext;
//		uuid = AndroidUtil.getDeviceUUID(appContext);
	}

	/**
	 * 获取设备UUID
	 * @return 设备UUID {@link Context}
	 */
	public static String getUUID()
	{
		return uuid;
	}

	/**
	 * 获取设备版本名称
	 * @return 设备版本名称 {@link Context}
	 */
	public static String getVersionName() {
//		return AndroidUtil.getVersionName(appContext);
		return "";
	}
}
