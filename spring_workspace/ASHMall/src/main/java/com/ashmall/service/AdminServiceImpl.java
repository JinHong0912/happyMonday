package com.ashmall.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ashmall.domain.AdminVO;
import com.ashmall.dto.AdminDTO;
import com.ashmall.persistence.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO dao;
	
	@Inject
	private BCryptPasswordEncoder passwdEncrypt;
	
	@Override
	public AdminVO login(AdminDTO dto) throws Exception {
		
		AdminVO vo = dao.login(dto);
		
		if(vo!=null) {
			
			dao.loginUpdate(dto.getAdmin_id());
		}
		
		return vo;
	}

}
