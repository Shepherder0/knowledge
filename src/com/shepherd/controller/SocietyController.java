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

import com.shepherd.entity.Society;
import com.shepherd.service.SocietyService;

/**
 * 社会控制器
 * @author Administrator
 *
 */
@Controller
public class SocietyController {

	@Autowired
	private SocietyService societyService;
	

	@RequestMapping(value="society",method=RequestMethod.GET)
	public String SocietyJsp() {
		
		return "society";
	}
	
	List<Society> society;
	List<Society> society02 = new ArrayList<Society>();
	
	@ResponseBody
	@RequestMapping(value="society",method=RequestMethod.POST)
	public List<Society> getAllSociety(){
		
		society02.clear();
		
		society = societyService.GetAllSociety();
		
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()<10){
		set.add((int)((13-1+1)*Math.random()+1));
		}
		Object[] ints = set.toArray();
		for(int i = 0;i<ints.length;i++){
			
			int temp = (int) ints[i];
			society02.add(society.get(temp-1));
		}
		
		return society02;
		
	}
	
	
	@ResponseBody
	@RequestMapping(value="societyResult",method=RequestMethod.POST)
	public String checkResultOfSociety(@RequestParam(required = false, value = "list[]") List<String> result) {
		
		int All = result.size();//题目是
		int Temp = 0;//正确题数
		double Probability;//正确率
		System.out.println();
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
			System.out.println(society02.get(i).getAnswer());
			System.out.println("***************");
			int flag = society02.get(i).getAnswer().compareTo(result.get(i));
			if(flag==0){
				Temp++;
			}
		}
		
		System.out.println(Temp);
		Probability = (double)Temp/(double)All;
		String resultString = String.valueOf(Probability*100);
		
		return resultString;
	}
		
		
	@RequestMapping(value="soResult",method=RequestMethod.GET)
	public ModelAndView soResult(@RequestParam("data")String data){
		System.out.println(data);

		ModelAndView modelAndView = new ModelAndView("soResult","probability",data);
		return modelAndView;
		
	}


	public SocietyService getSocietyService() {
		return societyService;
	}


	public void setSocietyService(SocietyService societyService) {
		this.societyService = societyService;
	}
		
		
}
	
	
	

