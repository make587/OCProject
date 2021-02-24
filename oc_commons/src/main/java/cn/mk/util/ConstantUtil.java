package cn.mk.util;

import java.util.Properties;
/**
 * <b>智慧公务车信息平台-常量工具类</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
public class ConstantUtil {

	private static Properties props = new Properties();

	static{
		try {
			props.load(ConstantUtil.class.getClassLoader().getResourceAsStream("props/system.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	//当前页码
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));

	//每页显示数量
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));

	//token 加密 秘钥
	public static final String SECRET_KEY = props.getProperty("secret.key");

	//过期时间
	public static final Integer EXPIRE_MINUTE = Integer.parseInt(props.getProperty("expire.minute"));

}
