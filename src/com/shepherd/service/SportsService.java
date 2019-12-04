package com.shepherd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Sports;

@Service
public interface SportsService {

	/**
	 * 获取所有体育题目信息
	 * @return
	 */
	List<Sports> GetAllSports();
	
	int InsertSports(List<Sports> list);
}
