package com.school.portal.entity.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.school.portal.entity.BaseModel;

/**
 * 
 * @author Fe
 * 角色
 */
public class Role implements BaseModel<Role>,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3644717079374741801L;
	
	public static final Integer STATUS_ENABLE = 5;
	public static final Integer STATUS_DISABLE = 10;

	public Class<Role> getModelClass() {
		return Role.class;
	}
	
	/**主键**/
	private Long roleId;
	/**code编码**/
	private String code;
	/**状态**/
	private Integer status = STATUS_ENABLE;
	/**角色名称**/
	private String roleName;
	/**创建时间**/
	private Date createTime;
	/**修改时间**/
	private Date updateTime;
	
	public Role() {}
	
	public Role(Long roleId, String code, Integer status, String roleName,
			Date createTime, Date updateTime) {
		super();
		this.roleId = roleId;
		this.code = code;
		this.status = status;
		this.roleName = roleName;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	
	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
