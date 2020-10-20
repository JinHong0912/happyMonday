package com.ashmall.persistence;

import com.ashmall.domain.AdminVO;
import com.ashmall.dto.AdminDTO;

public interface AdminDAO {

	// 로그인
	public AdminVO login(AdminDTO dto) throws Exception;
	
	// 로그인 시간 업데이트
	public void loginUpdate(String admin_id) throws Exception;
}
