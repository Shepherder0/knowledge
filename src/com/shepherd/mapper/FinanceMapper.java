package com.shepherd.mapper;

import java.util.List;

import com.shepherd.entity.Finance;

public interface FinanceMapper {
	
	public List<Finance> GetAllFinance();
	
	public int InsertFinance(List<Finance> list);

}
