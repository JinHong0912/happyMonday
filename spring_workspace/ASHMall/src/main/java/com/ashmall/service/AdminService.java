package com.ashmall.service;

import com.ashmall.domain.AdminVO;
import com.ashmall.dto.AdminDTO;

public interface AdminService {

	// 로그인
	public AdminVO login(AdminDTO dto) throws Exception;
}
