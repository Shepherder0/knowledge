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

import com.shepherd.entity.Technology;
import com.shepherd.service.TechnologyService;


/**
 * 科技控制器
 * @author Administrator
 *
 */
@Controller
public class TechnologyController {

	@Autowired
	private TechnologyService technologyService;

	public TechnologyService getTechnologyService() {
		return technologyService;
	}

	public void setTechnologyService(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}

	/**
	 * 跳转到科技答题页面
	 * @return
	 */
	@RequestMapping(value="technology",method=RequestMethod.GET)
	public String MedicinesJsp(){
		return "technology";
	}
	
	
	List<Technology> technology;//所有题目
	List<Technology> technology02 = new ArrayList<Technology>();//随机10个题目
	/**
	 * 获取数据库题目
	 * @return 随机10个题目
	 */
	@ResponseBody
	@RequestMapping(value="technology",method=RequestMethod.POST)
	public List<Technology> getAllTechnology(){
		technology02.clear();
		//获取所有题目
		technology = technologyService.GetAllTechnology();
		//生成1-14的10个随机数，从而随机选择10道不同的题目
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()<10){
		set.add((int)((14-1+1)*Math.random()+1));
		}
		Object[] ints = set.toArray();
		for(int i = 0;i<ints.length;i++){
			
			System.out.println(ints[i]);
			int temp = (int) ints[i];
			System.out.println(technology.get(temp-1));
			//medicine02.add(medicine.get(temp));
			technology02.add(technology.get(temp-1));
		}
		return technology02;
	}
	
	/**
	 * 处理页面传输过来的答题选项（Json数据）
	 * @param result
	 * @return 答题的正确率
	 */
	@ResponseBody
	@RequestMapping(value="technologyResult",method=RequestMethod.POST)
	public String checkResult(@RequestParam(required = false, value = "list[]") List<String> result) {
		
		int All = result.size();//题目是
		int Temp = 0;//正确题数
		double Probability;//正确率
		System.out.println();
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
			System.out.println(technology02.get(i).getAnswer());
			System.out.println("***************");
			int flag = technology02.get(i).getAnswer().compareTo(result.get(i));
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
	 * 跳转到科技答题后的页面
	 * @return
	 */
	@RequestMapping(value="teResult",method=RequestMethod.GET)
	public ModelAndView teResult(@RequestParam("data")String data){
		System.out.println(data);

		ModelAndView modelAndView = new ModelAndView("teResult","probability",data);
		return modelAndView;
		
	}
	
	
}
