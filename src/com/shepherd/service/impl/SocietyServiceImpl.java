package com.shepherd.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Society;
import com.shepherd.mapper.SocietyMapper;
import com.shepherd.service.SocietyService;


@Service
public class SocietyServiceImpl implements SocietyService{

	
	private SocietyMapper societyMapper;
	
	@Override
	public List<Society> GetAllSociety() {

		List<Society> list = societyMapper.GetAllSociety();
		return list;
	}

	@Override
	public int InsertSociety(List<Society> list) {

		int i = societyMapper.InsertSociety(list);
		return i;
	}

	public SocietyMapper getSocietyMapper() {
		return societyMapper;
	}

	public void setSocietyMapper(SocietyMapper societyMapper) {
		this.societyMapper = societyMapper;
	}

}
