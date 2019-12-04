package com.shepherd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Medicine;

@Service
public interface MedicineService {
	
	/**
	 * 获取所有医药问题信息
	 * @return 医药信息的list集合
	 */
	List<Medicine> GetAllMedicine();
	
	int InsertMedicine(List<Medicine> list);

}
