package com.school.portal;

import java.io.Serializable;
import java.util.List;

import com.school.portal.entity.system.Permission;
import com.school.portal.entity.system.Role;
import com.school.portal.entity.system.User;


public class UserDetail implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6142832470237759973L;
	
	private User user;
	private List<Role> roleList;
	private List<Permission> perList;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	public List<Permission> getPerList() {
		return perList;
	}
	public void setPerList(List<Permission> perList) {
		this.perList = perList;
	}
}
