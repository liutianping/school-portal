package com.school.portal.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/home")
public class HomeController {
	
	@RequestMapping(value="toLogin.htm",method=RequestMethod.GET)
	public String toLogin() {
		return "login";
	}
	
	@RequestMapping(value="login.htm",method=RequestMethod.POST)
	public String login(@RequestParam String userName,
			@RequestParam String password,@RequestParam String code) {
		
		return "index";
	}
	
	
	@RequestMapping(value="toRegist.htm",method=RequestMethod.GET)
	public String toRegist(HttpServletRequest request) {
		return "regist";
	}

	@RequestMapping(value="regist.htm",method=RequestMethod.POST)
	public String regist(HttpServletRequest request) {
		return "regist";
	}
	
}
