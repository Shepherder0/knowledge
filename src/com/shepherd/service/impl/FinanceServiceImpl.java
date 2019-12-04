package com.shepherd.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Finance;
import com.shepherd.mapper.FinanceMapper;
import com.shepherd.service.FinanceService;

@Service
public class FinanceServiceImpl implements FinanceService {
	
	private FinanceMapper financeMapper;
	
	@Override
	public List<Finance> GetAllFinance() {
		List<Finance> list = financeMapper.GetAllFinance();
		return list;
	}

	@Override
	public int InsertFinance(List<Finance> list) {

		int i = financeMapper.InsertFinance(list);
		return i;
	}

	public FinanceMapper getFinanceMapper() {
		return financeMapper;
	}

	public void setFinanceMapper(FinanceMapper financeMapper) {
		this.financeMapper = financeMapper;
	}
	
	

}
