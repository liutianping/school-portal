package com.school.portal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.school.portal.entity.system.Permission;

public class PortalSecurity {
	
	public static final String SECURITY_SUFFIX = "_";
	
	private Map<String,Permission> security = new ConcurrentHashMap<String, Permission>();
	
	public void initSecurity() {
		
	}
	
	public  void clear() {
		security.clear();
	}
	
	public String getSecurityKey(Long userRoleId,Long resourceId) {
		return userRoleId + SECURITY_SUFFIX + resourceId;
	}
	
	
	
}
