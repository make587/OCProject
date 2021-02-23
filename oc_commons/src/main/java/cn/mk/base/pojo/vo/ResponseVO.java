package cn.mk.base.pojo.vo;

import cn.mk.base.pojo.enums.ResponseEnum;

import java.io.Serializable;

/**
 * <b>智慧公务车信息平台-系统响应视图信息</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = -5366144745626852040L;
	private Integer code;                   //系统响应编码
	private E data;                         //系统响应数据

	private ResponseVO(Integer code){
		this.code = code;
	}

	private ResponseVO(Integer code, E data){
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	/**
	 * <b>获得系统响应处理成功视图信息</b>
	 * @return
	 */
	public static ResponseVO successResponseVO(){
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS.getCode());
	}

	/**
	 * <b>获得系统响应处理成功视图信息</b>
	 * @return
	 */
	public static ResponseVO successResponseVO(Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS.getCode(),data);
	}

	/**
	 * <b>获得系统响应处理失败视图信息</b>
	 * @return
	 */
	public static ResponseVO errorResponseVO(Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_ERROR.getCode(),data);
	}

	/**
	 * <b>获得系统响应处理异常视图信息</b>
	 * @return
	 */
	public static ResponseVO exceptionResponseVO(Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_EXCEPTION.getCode(),data);
	}
}
