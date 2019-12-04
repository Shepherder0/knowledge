package com.shepherd.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Technology;
import com.shepherd.mapper.TechnologyMapper;
import com.shepherd.service.TechnologyService;

@Service
public class TechnologyServiceImpl implements TechnologyService {

	 private TechnologyMapper technologyMapper;
	
	@Override
	public List<Technology> GetAllTechnology() {

		List<Technology> list = technologyMapper.GetAllTechnology();
		return list;
	}

	@Override
	public int InsertTechnology(List<Technology> list) {

		int i = technologyMapper.InsertTechnology(list);
		return i;
	}

	public TechnologyMapper getTechnologyMapper() {
		return technologyMapper;
	}

	public void setTechnologyMapper(TechnologyMapper technologyMapper) {
		this.technologyMapper = technologyMapper;
	}
	
	

}
