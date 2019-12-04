package com.shepherd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Finance;

@Service
public interface FinanceService {

	/**
	 * 获取所有财经题目信息
	 * @return
	 */
	List<Finance> GetAllFinance();
	
	int InsertFinance(List<Finance> list);
}
