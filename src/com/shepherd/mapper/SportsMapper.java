package com.shepherd.mapper;

import java.util.List;

import com.shepherd.entity.Sports;

public interface SportsMapper {

	public List<Sports> GetAllSports();
	
	public int InsertSports(List<Sports> list);
	
}
