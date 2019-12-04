package com.shepherd.mapper;

import java.util.List;

import com.shepherd.entity.Technology;

public interface TechnologyMapper {
	
	
	public List<Technology> GetAllTechnology();

	public int InsertTechnology(List<Technology> list);
}
