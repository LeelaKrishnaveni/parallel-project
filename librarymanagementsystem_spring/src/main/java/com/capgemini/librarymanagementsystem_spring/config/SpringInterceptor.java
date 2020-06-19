package com.capgemini.librarymanagementsystem_spring.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SpringInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		  response.addHeader("access-control-allow-origin","http://localhost:4200");
		 response.addHeader("access-control-allow-method","GET,POST,DELETE,PUT");
		 response.addHeader("access-control-allow-header","x-requested-with,origin,content-type,Accept,x-coding");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		return ;
	}

	
   
}
