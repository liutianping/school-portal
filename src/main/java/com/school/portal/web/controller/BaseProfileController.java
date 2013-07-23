package com.school.portal.web.controller;

import org.springframework.web.servlet.ModelAndView;

import com.school.portal.Contants;
import com.school.portal.UserDetail;
import com.school.portal.UserDetailAware;


public class BaseProfileController extends AbstractController implements UserDetailAware{
	
	private  ThreadLocal<UserDetail> userDetail = new ThreadLocal<UserDetail>();
	
	private  ThreadLocal<String> httpBody = new ThreadLocal<String>();

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail.set(userDetail);
	}
	
	protected UserDetail getUserDetail() {
		return this.userDetail.get();
	}
	
	public void setHttpBody(String httpBody) {
		this.httpBody.set(httpBody);
	}
	
	public String getHttpBody() {
		return this.httpBody.get();
	}
	
	protected ModelAndView getJsonModelAndView() {
		return new ModelAndView(Contants.JSON_VIEW);
	}
	
}
