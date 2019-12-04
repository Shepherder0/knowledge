package com.shepherd.mapper;

import java.util.List;

import com.shepherd.entity.Language;

public interface LanguageMapper {
	
	public List<Language> GetAllLanguage();
	
	public int InsertLanguage(List<Language> list);

}
