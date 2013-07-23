package com.school.portal.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ResourcesService extends BaseService {
	
	public void initResources();

}
