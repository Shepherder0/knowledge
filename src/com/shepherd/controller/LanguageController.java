package com.shepherd.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shepherd.entity.Language;
import com.shepherd.service.LanguageService;


/**
 * 语言类控制器
 * @author Administrator
 *
 */
@Controller
public class LanguageController {

	@Autowired
	private LanguageService languageService;
	
	public LanguageService getLanguageService() {
		return languageService;
	}

	public void setLanguageService(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	/**
	 * 跳转到语言答题页面
	 * @return
	 */
	@RequestMapping(value="language",method=RequestMethod.GET)
	public String LanguageJsp(){
		return "language";
	}
	
	
	List<Language> language;//所有题目
	List<Language> language02 = new ArrayList<Language>();//随机10个题目
	/**
	 * 获取数据库题目
	 * @return 随机10个题目
	 */
	@ResponseBody
	@RequestMapping(value="language",method=RequestMethod.POST)
	public List<Language> getAllMedicines(){
		
		
		language02.clear();
		//获取所有题目
		language = languageService.GetAllLanguage();
		//生成1-14的10个随机数，从而随机选择10道不同的题目
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()<10){
		set.add((int)((14-1+1)*Math.random()+1));
		}
		Object[] ints = set.toArray();
		for(int i = 0;i<ints.length;i++){
			
			int temp = (int) ints[i];
			language02.add(language.get(temp-1));
		}
		return language02;
	}
	
	/**
	 * 处理页面传输过来的答题选项（Json数据）
	 * @param result
	 * @return 答题的正确率
	 */
	@ResponseBody
	@RequestMapping(value="languageResult",method=RequestMethod.POST)
	public String checkResult(@RequestParam(required = false, value = "list[]") List<String> result) {
		
		int All = result.size();//题目是
		int Temp = 0;//正确题数
		double Probability;//正确率
		System.out.println();
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
			System.out.println(language02.get(i).getAnswer());
			System.out.println("***************");
			int flag = language02.get(i).getAnswer().compareTo(result.get(i));
			if(flag==0){
				Temp++;
			}
		}
		
		System.out.println(Temp);
		Probability = (double)Temp/(double)All;
		String resultString = String.valueOf(Probability*100);
		
		return resultString;
	}
	/**
	 * 跳转到医药答题后的页面
	 * @return
	 */
	@RequestMapping(value="laResult",method=RequestMethod.GET)
	public ModelAndView laResult(@RequestParam("data")String data){
		System.out.println(data);

		ModelAndView modelAndView = new ModelAndView("laResult","probability",data);
		return modelAndView;
		
	}

	
	
	
	
	
	
}
