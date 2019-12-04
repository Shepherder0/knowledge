package com.shepherd.service;


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


@Service
public interface ManagerService {
	
	//登录检测用
	Manager LoginCheck(Manager manager);
	
	
 	
	public Search medicineSearch(SearchData search);
	
	public Search financeSearch(SearchData search);
	
	public Search technologySearch(SearchData search);
	
	public Search languageSearch(SearchData search);
	
	public Search sportsSearch(SearchData search);
	
	public Search societySearch(SearchData search);
	
	public Search comprehensiveSearch(SearchData search);
	
	
	public int medicineUpdate(Medicine medicine);
	
	public int financeUpdate(Finance finance);
	
	public int technologyUpdate(Technology technology);
	
	public int languageUpdate(Language language );
	
	public int sportsUpdate(Sports sports);
	
	public int societyUpdate(Society society);
	
	public int comprehensiveUpdate(Comprehensive comprehensive);
	
	
	
	
}
