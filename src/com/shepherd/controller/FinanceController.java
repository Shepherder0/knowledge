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

import com.shepherd.entity.Finance;
import com.shepherd.service.FinanceService;

/**
 * 医药类控制器
 * @author Administrator
 *
 */
@Controller
public class FinanceController {

	@Autowired
	private FinanceService financeService;

	public FinanceService getFinanceService() {
		return financeService;
	}

	public void setFinanceService(FinanceService financeService) {
		this.financeService = financeService;
	}

	@RequestMapping(value="finance",method=RequestMethod.GET)
	public String FinanceJsp() {
		
		return "finance";
	}
	
	List<Finance> finance;
	List<Finance> finance02 = new ArrayList<Finance>();
	
	@ResponseBody
	@RequestMapping(value="finance",method=RequestMethod.POST)
	public List<Finance> getAllFinances(){
		
		finance02.clear();
		
		finance = financeService.GetAllFinance();
		
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()<10){
		set.add((int)((14-1+1)*Math.random()+1));
		}
		Object[] ints = set.toArray();
		for(int i = 0;i<ints.length;i++){
			
			int temp = (int) ints[i];
			finance02.add(finance.get(temp-1));
		}
		
		return finance02;
		
	}
	
	
	@ResponseBody
	@RequestMapping(value="financeResult",method=RequestMethod.POST)
	public String checkResultOfFinance(@RequestParam(required = false, value = "list[]") List<String> result) {
		
		int All = result.size();//题目是
		int Temp = 0;//正确题数
		double Probability;//正确率
		System.out.println();
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
			System.out.println(finance02.get(i).getAnswer());
			System.out.println("***************");
			int flag = finance02.get(i).getAnswer().compareTo(result.get(i));
			if(flag==0){
				Temp++;
			}
		}
		
		System.out.println(Temp);
		Probability = (double)Temp/(double)All;
		String resultString = String.valueOf(Probability*100);
		
		return resultString;
	}
		
		
	@RequestMapping(value="fiResult",method=RequestMethod.GET)
	public ModelAndView meResult(@RequestParam("data")String data){
		System.out.println(data);

		ModelAndView modelAndView = new ModelAndView("fiResult","probability",data);
		return modelAndView;
		
	}
		
		
}
	
	
	

