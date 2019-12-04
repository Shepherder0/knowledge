package com.shepherd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Comprehensive;

@Service
public interface ComprehensiveService {
	
	List<Comprehensive> GetAllComprehensive();
	
	int InsertComprehensive(List<Comprehensive> list);

}
