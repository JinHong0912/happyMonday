package com.ashmall.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashmall.domain.AdminVO;
import com.ashmall.dto.AdminDTO;
import com.ashmall.service.AdminService;

@Controller
@RequestMapping("/admin/*")
public class AdminController {

	@Autowired
	private AdminService service;
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	/* 로그인(GET) */ 
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String adminMain() {
		return "admin/main";
	}
	
	/* 로그인(POST) */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginPOST(AdminDTO dto, RedirectAttributes redirect, HttpSession session) throws Exception {
		
		logger.info("=====login(POST) execute()");
		logger.info("=====AdminDTO : "+dto.toString());
		
		AdminVO vo = null;
		vo = service.login(dto);
		String msg = "";
		
		if(vo!= null) {
			
			session.setAttribute("admin", vo);
			msg = "LOGIN_SUCCESS";
		} else {
			msg = "LOGIN_FAIL";
		}
		redirect.addFlashAttribute("msg", msg);
		return "redirect:/admin/main";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession session, RedirectAttributes redirect) {
		
		logger.info("=====logout(POST) execute");
		
		session.invalidate();
		redirect.addFlashAttribute("msg", "LOGOUT_SUCCESS");
	
		return "redirect:/admin/main";
	}
}
