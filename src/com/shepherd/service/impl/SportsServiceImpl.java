package com.shepherd.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Sports;
import com.shepherd.mapper.SportsMapper;
import com.shepherd.service.SportsService;

@Service
public class SportsServiceImpl implements SportsService {

	
	private SportsMapper sportsMapper;
	@Override
	public List<Sports> GetAllSports() {

		List<Sports> list = sportsMapper.GetAllSports();
		return list;
	}

	@Override
	public int InsertSports(List<Sports> list) {

		int i = sportsMapper.InsertSports(list);
		return i;
	}

	public SportsMapper getSportsMapper() {
		return sportsMapper;
	}

	public void setSportsMapper(SportsMapper sportsMapper) {
		this.sportsMapper = sportsMapper;
	}

	
	
}
