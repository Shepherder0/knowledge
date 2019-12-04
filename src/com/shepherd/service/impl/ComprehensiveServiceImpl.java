package com.shepherd.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Comprehensive;
import com.shepherd.mapper.ComprehensiveMapper;
import com.shepherd.service.ComprehensiveService;

@Service
public class ComprehensiveServiceImpl implements ComprehensiveService {

	
	private ComprehensiveMapper comprehensiveMapper;
	
	@Override
	public List<Comprehensive> GetAllComprehensive() {

		List<Comprehensive> list = comprehensiveMapper.GetAllComprehensive();
		return list;
	}

	@Override
	public int InsertComprehensive(List<Comprehensive> list) {

		int i = comprehensiveMapper.InsertComprehensive(list);
		return i;
	}

	public ComprehensiveMapper getComprehensiveMapper() {
		return comprehensiveMapper;
	}

	public void setComprehensiveMapper(ComprehensiveMapper comprehensiveMapper) {
		this.comprehensiveMapper = comprehensiveMapper;
	}

}
