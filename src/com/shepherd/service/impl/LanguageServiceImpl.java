package com.shepherd.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Language;
import com.shepherd.mapper.LanguageMapper;
import com.shepherd.service.LanguageService;

@Service
public class LanguageServiceImpl implements LanguageService {

	private LanguageMapper languageMapper;
	
	@Override
	public List<Language> GetAllLanguage() {

		List<Language> list = languageMapper.GetAllLanguage();
		return list;
	}

	@Override
	public int InsertLanguage(List<Language> list) {

		int i = languageMapper.InsertLanguage(list);
		return i;
	}

	public LanguageMapper getLanguageMapper() {
		return languageMapper;
	}

	public void setLanguageMapper(LanguageMapper languageMapper) {
		this.languageMapper = languageMapper;
	}

}
