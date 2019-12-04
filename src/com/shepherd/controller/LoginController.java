package com.shepherd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shepherd.entity.Manager;
import com.shepherd.entity.User;
import com.shepherd.service.ManagerService;
import com.shepherd.service.UserService;

/**
 * 登录控制器
 * @author Administrator
 *
 */
@Controller
public class LoginController {
	
	
	@Autowired
	ManagerService managerservice;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="login")
	public ModelAndView Login(@RequestParam("name")String name,@RequestParam("pwd")String pwd,HttpServletRequest request ) {
		
		Manager manager = new Manager(name, pwd);
		Manager manager2 = managerservice.LoginCheck(manager);
		
		//创建session对象
		HttpSession session = request.getSession(); 
		
		
		User user = new User(name, pwd);
		User user2 = new User() ;
		
		
		ModelAndView modelAndView = null;
		if (manager2==null) {
			
			user2 = userService.GetOneUser(user);
			
			if (user2==null) {
				
				String checkLogin = "用户名或密码错误";
				
				modelAndView = new ModelAndView("index","checkLogin",checkLogin);
				return modelAndView;
				
			}else {
				//将user对象存放到session中
				session.setAttribute("user", user2);
				modelAndView = new ModelAndView("home","user",user);
				return modelAndView;
			}
		}
		//将manager对象存放到session中
		session.setAttribute("manager", manager2);
		modelAndView = new ModelAndView("home","user",manager2);
		
		return modelAndView;
	}
	
	
	@RequestMapping(value="home")
	public String Tourist() {
		
		return "home";
	}
	
	@RequestMapping(value="logout")
	public String LogOut(HttpServletRequest request) {
		
		HttpSession session = request.getSession(true);
		session.removeAttribute("user");
		session.removeAttribute("manager");
		return "index";
	}
	
	
	
}
