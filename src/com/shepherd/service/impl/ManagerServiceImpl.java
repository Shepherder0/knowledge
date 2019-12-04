package com.shepherd.service.impl;


import org.springframework.stereotype.Service;

import com.shepherd.entity.Comprehensive;
import com.shepherd.entity.Finance;
import com.shepherd.entity.Language;
import com.shepherd.entity.Manager;
import com.shepherd.entity.Medicine;
import com.shepherd.entity.Search;
import com.shepherd.entity.SearchData;
import com.shepherd.entity.Society;
import com.shepherd.entity.Sports;
import com.shepherd.entity.Technology;
import com.shepherd.mapper.ManagerMapper;
import com.shepherd.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {
	
	
	private ManagerMapper managerMapper;

	public ManagerMapper getManagerMapper() {
		return managerMapper;
	}

	public void setManagerMapper(ManagerMapper managerMapper) {
		this.managerMapper = managerMapper;
	}

	//登录检测
	public Manager LoginCheck(Manager manager) {

		
		Manager managerCall = managerMapper.GetOneByNameAndPwd(manager);
		
		return managerCall;
	}

	

	@Override
	public Search medicineSearch(SearchData search) {

		Search search2 = managerMapper.medicineSearch(search);
		return search2;
	}

	@Override
	public Search financeSearch(SearchData search) {

		Search search2 = managerMapper.financeSearch(search);
		return search2;
	}

	@Override
	public Search technologySearch(SearchData search) {

		Search search2 = managerMapper.technologySearch(search);
		return search2;
	}

	@Override
	public Search languageSearch(SearchData search) {

		Search search2 = managerMapper.languageSearch(search);
		return search2;
	}

	@Override
	public Search sportsSearch(SearchData search) {

		Search search2 = managerMapper.sportsSearch(search);
		return search2;
	}

	@Override
	public Search societySearch(SearchData search) {

		Search search2 = managerMapper.societySearch(search);
		return search2;
	}

	@Override
	public Search comprehensiveSearch(SearchData search) {

		Search search2 = managerMapper.comprehensiveSearch(search);
		return search2;
	}

	
	
	
	
	
	@Override
	public int medicineUpdate(Medicine medicine) {

		int i = managerMapper.medicineUpdate(medicine);
		return i;
	}

	@Override
	public int financeUpdate(Finance finance) {

		int i = managerMapper.financeUpdate(finance);
		return i;
	}

	@Override
	public int technologyUpdate(Technology technology) {

		int i = managerMapper.technologyUpdate(technology);
		return i;
	}

	@Override
	public int languageUpdate(Language language) {

		int i = managerMapper.languageUpdate(language);
		return i;
	}

	@Override
	public int sportsUpdate(Sports sports) {

		int i = managerMapper.sportsUpdate(sports);
		return i;
	}

	@Override
	public int societyUpdate(Society society) {

		int i = managerMapper.societyUpdate(society);
		return i;
	}

	@Override
	public int comprehensiveUpdate(Comprehensive comprehensive) {

		int i = managerMapper.comprehensiveUpdate(comprehensive);
		return i;
	}

	

}
