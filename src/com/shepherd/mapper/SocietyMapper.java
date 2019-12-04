package com.shepherd.mapper;

import java.util.List;

import com.shepherd.entity.Society;

public interface SocietyMapper {
	
	public List<Society> GetAllSociety();
	
	public int InsertSociety(List<Society> list);

}
