package com.school.portal.web.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlFilter implements Filter {
	
	private List<String> urlList;

	public void init(FilterConfig filterConfig) throws ServletException {
		urlList = new ArrayList<String>();
		urlList.add("/index.jsp");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
	   HttpServletRequest httpServletRequest = (HttpServletRequest)request;
	   HttpServletResponse httpServletResponse = (HttpServletResponse)response;
	   String uri = httpServletRequest.getRequestURI();
	   
	   if (uri == null || uri.length() == 0 || uri.equals("/")) {
		   httpServletResponse.sendRedirect("/home/toLogin.htm");
		   return;
	   } 
	   
	   if (urlList.contains(uri)) {
		   httpServletResponse.sendRedirect(uri);
	   } else {
		   chain.doFilter(request, response);
	   }
	}

	public void destroy() {
		
	}

}
