package com.school.portal.entity.system;

import java.io.Serializable;
import java.util.Date;


import com.school.portal.entity.BaseModel;

/**
 * 权限
 * @author Fe
 *
 */
public class Permission implements BaseModel<Permission>,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6949328170121874027L;
	public Class<Permission> getModelClass() {
		return Permission.class;
	}

	private Long permissionId;
	private String code;
	private Integer operate;
	private Date createTime;
	private Date updateTime;
	private Date version;
	private Role role;
	private Resource resource;
	
	public Permission() {}
	
	public Permission(Long permissionId, String code, Integer operate, Date createTime,
			Date updateTime, Date version, Role role, Resource resources) {
		super();
		this.permissionId = permissionId;
		this.code = code;
		this.operate = operate;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.version = version;
		this.role = role;
		this.resource = resource;
	}

	
	public Long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getOperate() {
		return operate;
	}
	public void setOperate(Integer operate) {
		this.operate = operate;
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
	
	public void setVersion(Date version) {
		this.version = version;
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	
	
}
