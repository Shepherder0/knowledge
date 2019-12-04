package com.shepherd.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Medicine;
import com.shepherd.mapper.MedicineMapper;
import com.shepherd.service.MedicineService;

@Service
public class MedicineServiceImpl implements MedicineService {

	private MedicineMapper medicineMapper;
	
	
	public MedicineMapper getMedicineMapper() {
		return medicineMapper;
	}

	public void setMedicineMapper(MedicineMapper medicineMapper) {
		this.medicineMapper = medicineMapper;
	}

	@Override
	public List<Medicine> GetAllMedicine() {

		List<Medicine> list = medicineMapper.GetAllMedicine();
		return list;
	}

	@Override
	public int InsertMedicine(List<Medicine> list) {

		int i= medicineMapper.InsertMedicine(list);
		
		return i;
	}

}
