package com.shepherd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Society;

@Service
public interface SocietyService {

	/**
	 * 获取所有社会题目信息
	 * @return
	 */
	List<Society> GetAllSociety();
	
	int InsertSociety(List<Society> list);
}
