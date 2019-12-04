package com.shepherd.mapper;

import java.util.List;

import com.shepherd.entity.Medicine;

public interface MedicineMapper {
	
	public List<Medicine> GetAllMedicine();
	
	public int InsertMedicine(List<Medicine> list);

}
