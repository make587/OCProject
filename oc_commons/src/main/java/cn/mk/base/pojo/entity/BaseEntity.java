package cn.mk.base.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>智慧公务车信息平台-基础实体信息</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = -3078699230573192599L;
	private Integer status;                 //系统状态： 0-禁用，1-启用
	private Long createUser;                //创建人
	private Date createTime;                //创建时间
	private Long updateUser;                //修改人
	private Long updateTime;                //修改时间

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
}
