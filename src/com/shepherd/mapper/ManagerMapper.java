package com.shepherd.mapper;


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

public interface ManagerMapper {
	
	public Manager GetOneByNameAndPwd(Manager manager);
	
	
	//搜索
	public Search medicineSearch(SearchData search);
	
	public Search financeSearch(SearchData search);
	
	public Search technologySearch(SearchData search);
	
	public Search languageSearch(SearchData search);
	
	public Search sportsSearch(SearchData search);
	
	public Search societySearch(SearchData search);
	
	public Search comprehensiveSearch(SearchData search);

	
	//修改
	public int medicineUpdate(Medicine medicine);
	
	public int financeUpdate(Finance finance);
	
	public int technologyUpdate(Technology technology);
	
	public int languageUpdate(Language language );
	
	public int sportsUpdate(Sports sports);
	
	public int societyUpdate(Society society);
	
	public int comprehensiveUpdate(Comprehensive comprehensive);
	
	
	
}
