package com.shepherd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shepherd.entity.Comprehensive;
import com.shepherd.entity.Finance;
import com.shepherd.entity.Language;
import com.shepherd.entity.Medicine;
import com.shepherd.entity.Search;
import com.shepherd.entity.SearchData;
import com.shepherd.entity.Society;
import com.shepherd.entity.Sports;
import com.shepherd.entity.Technology;
import com.shepherd.service.ManagerService;

/**
 * 管理员控制器
 * @author Administrator
 *
 */
@Controller
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;

	public ManagerService getManagerService() {
		return managerService;
	}

	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}
	
	
	@RequestMapping(value="systerm")
	public String SystermControll() {
		
		return "systerm";
	}
	
	/**
	 * 按照分类和ID查找题目信息
	 * @param serch
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="searchByID",method=RequestMethod.POST)
	public Search SearchByID(@RequestParam(required = false, value = "list[]") List<String> check) {
		
		System.out.println(check.get(0));
		System.out.println(check.get(1));
		String type = check.get(0);
		int ID = Integer.parseInt(check.get(1));
		
		String idString = "";
		//判定题目类型
		switch (type) {
		case "medicinetable": idString = "mID";
			break;
		case "finance": idString = "fID";
			break;
		case "technology": idString = "tID";
			break;
		case "language": idString = "lID";
			break;
		case "sports": idString = "sID";
			break;
		case "society": idString = "sID";
			break;
		case "comprehensive": idString = "cID";
			break;
		default:
			break;
		}
		
		//分类查询
		SearchData dataList = new SearchData(type, idString, ID);
		Search topic = new Search();
		
		switch (type) {
		case "medicinetable": 
			topic = managerService.medicineSearch(dataList);
			break;
		case "finance": 
			topic = managerService.financeSearch(dataList);
			break;
		case "technology": 
			topic = managerService.technologySearch(dataList);
			break;
		case "language":
			topic = managerService.languageSearch(dataList);
			break;
		case "sports": 
			topic = managerService.sportsSearch(dataList);
			break;
		case "society": 
			topic = managerService.societySearch(dataList);
			break;
		case "comprehensive":
			topic = managerService.comprehensiveSearch(dataList);
			break;
		default:
			break;
		}
		//查询
		System.out.println(type);
		System.out.println(topic);
		
		return topic;
	}
	
	
	/**
	 * 修改题目信息
	 * @param change
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="change",method=RequestMethod.POST)
	public int Change(@RequestParam(required = false, value = "list[]") List<String> change) {
		
		String type = change.get(0);
		int i = 0 ;
		switch (type) {
		case "medicinetable": 
			Medicine medicine = new Medicine(Integer.parseInt(change.get(1)) , change.get(2), change.get(3), change.get(4), 
					change.get(5), change.get(6),change.get(7));
			i = managerService.medicineUpdate(medicine);
			break;
		case "finance": 
			Finance finance = new Finance(Integer.parseInt(change.get(1)) , change.get(2), change.get(3), change.get(4), 
					change.get(5), change.get(6),change.get(7));
			i = managerService.financeUpdate(finance);
			break;
		case "technology": 
			Technology technology = new Technology(Integer.parseInt(change.get(1)) , change.get(2), change.get(3), change.get(4), 
					change.get(5), change.get(6),change.get(7));
			i = managerService.technologyUpdate(technology);
			break;
		case "language":
			Language language = new Language(Integer.parseInt(change.get(1)) , change.get(2), change.get(3), change.get(4), 
					change.get(5), change.get(6),change.get(7));
			i = managerService.languageUpdate(language);
			break;
		case "sports": 
			Sports sports = new Sports(Integer.parseInt(change.get(1)) , change.get(2), change.get(3), change.get(4), 
					change.get(5), change.get(6),change.get(7));
			i = managerService.sportsUpdate(sports);
			break;
		case "society": 
			Society society = new Society(Integer.parseInt(change.get(1)) , change.get(2), change.get(3), change.get(4), 
					change.get(5), change.get(6),change.get(7));
			i = managerService.societyUpdate(society);
			break;
		case "comprehensive":
			Comprehensive comprehensive = new Comprehensive(Integer.parseInt(change.get(1)) , change.get(2), change.get(3), change.get(4), 
					change.get(5), change.get(6),change.get(7));
			i = managerService.comprehensiveUpdate(comprehensive);
			break;
		default:
			break;
		}
		
		return i;
	}
	
	
	@RequestMapping(value="update",method=RequestMethod.GET)
	public String Update(HttpServletRequest request) {
		
		request.getSession().getServletContext().getRealPath("");
		
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("user"));
		if(session.getAttribute("manager")==null) {
			return "index";
		}
		
		return "update";
	}
	
	
	
	
	
	
	
	
	
	

}
