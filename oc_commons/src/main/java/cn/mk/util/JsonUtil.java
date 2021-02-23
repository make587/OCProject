package cn.mk.util;

import com.fasterxml.jackson.databind.json.JsonMapper;

/**
 * 将对象 和 JSON 格式字符串转换工具
 */
public class JsonUtil {
	/**
	 * 将对象转换为 JSON 格式字符串
	 * @param obj
	 * @return
	 */
	public static String parseToJSON(Object obj){
		//创建 JsonMapper 对象
		JsonMapper jsonMapper = new JsonMapper();
		try {
			return jsonMapper.writeValueAsString(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
		return "{}";
	}

	/**
	 * 将一个对象的JSON格式字符串转换为对象
	 * @param json
	 * @param objClass
	 * @return
	 * @throws Exception
	 */
	public static Object parseToObject(String json,Class objClass){
		//创建 JsonMapper 对象
		JsonMapper jsonMapper = new JsonMapper();
		try {
			return jsonMapper.readValue(json,objClass);
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
