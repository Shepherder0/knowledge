package com.shepherd.service;

import java.util.List;

import com.shepherd.entity.Technology;

public interface TechnologyService {
	
	/**
	 * 获取所有科技题目信息
	 * @return
	 */
	List<Technology> GetAllTechnology();
	
	int InsertTechnology(List<Technology> list);

}
