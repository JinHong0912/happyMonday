package com.ashmall.interceptor;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ashmall.service.MemberService;
import com.ashmall.dto.MemberDTO;
import com.ashmall.interceptor.AuthInterceptor;

public class AuthInterceptor extends HandlerInterceptorAdapter {

	@Inject
	private MemberService service;
	
	private static final Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);
	
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse resposnse, Object handler)
		throws Exception {
		
		HttpSession session = request.getSession();
		MemberDTO user = (MemberDTO) session.getAttribute("user");
		
		if(user == null) {
			logger.info("=====USER IS NOT SIGNED IT");
			resposnse.sendRedirect("/member/login");
			return false;
		}
		return true;
	}
	
}
