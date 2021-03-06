package com.school.portal;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContext implements ApplicationContextAware {


	public static ApplicationContext applicationContext = null;
	
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}
	
	public static <T> T getBean(String beanId) {
		return (T) applicationContext.getBean(beanId);
	}
	
	public static <T> T getBean(Class<T> requiredType) {
		return (T) applicationContext.getBean(requiredType);
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public static void clearHolder(){
		applicationContext = null;
	}

	public void destroy() throws Exception {
		SpringContext.clearHolder();
	}

}
