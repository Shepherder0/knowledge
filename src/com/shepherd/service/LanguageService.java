package com.shepherd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Language;

@Service
public interface LanguageService {

	/**
	 * 获取所有语言题目信息
	 * @return
	 */
	List<Language> GetAllLanguage();
	
	int InsertLanguage(List<Language> list);
}
