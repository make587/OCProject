package cn.mk.base.pojo.enums;


import java.util.Properties;

/**
 * <b>智慧公务车信息平台-枚举常量工具类</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
class EnumConstant {
	private static Properties props = new Properties();

	static{
		try {
			props.load(EnumConstant.class.getClassLoader().getResourceAsStream("/props/enums.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	//系统状态枚举信息：启用状态
	public static final Integer STATUS_ENABLE = Integer.parseInt(props.getProperty("status.enable"));

	//系统状态枚举信息：禁用状态
	public static final Integer STATUS_DISABLE = Integer.parseInt(props.getProperty("status.disable "));

	//系统响应码枚举信息：系统响应码处理成功
	public static final Integer RESPONSE_SUCCESS = Integer.parseInt(props.getProperty("response.success"));

	//系统响应码枚举信息：系统响应处理错误
	public static final Integer RESPONSE_ERROR = Integer.parseInt(props.getProperty("response.error"));

	//系统响应码枚举信息：系统响应处理异常
	public static final Integer RESPONSE_EXCEPTION = Integer.parseInt(props.getProperty("response.exception"));
}
