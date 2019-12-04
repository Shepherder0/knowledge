package com.shepherd.mapper;

import java.util.List;

import com.shepherd.entity.Comprehensive;

public interface ComprehensiveMapper {
	
	public List<Comprehensive> GetAllComprehensive();
	
	public int InsertComprehensive(List<Comprehensive> list);

}
