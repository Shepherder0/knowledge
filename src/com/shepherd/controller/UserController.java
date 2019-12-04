package com.shepherd.controller;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shepherd.entity.Scores;
import com.shepherd.entity.User;
import com.shepherd.service.UserService;


@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@ResponseBody
	@RequestMapping(value="regist",method=RequestMethod.POST)
	public int Register(@Param("name") String name,@Param("pwd") String pwd) {
		int i = 0;
		if(name!=null) {
			User user = new User(name, pwd, 0);
			System.out.println(user);
			i = userService.AddOne(user);
		}
		return i;
	}
	
	@RequestMapping(value="regist")
	public String Regist(){
		
		return "regist";
	}
	
	@RequestMapping("down")  
    public void down(HttpServletRequest request,HttpServletResponse response) throws Exception{  
       
        String fileName = request.getSession().getServletContext().getRealPath("static/excel/")+"百科知识题库模板.xlsx";  
        
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));  
          
        String filename = "百科知识题库模板.xlsx";  
        
        filename = URLEncoder.encode(filename,"UTF-8");  
        
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);    
            
        response.setContentType("multipart/form-data");   
        
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
        int len = 0;  
        while((len = bis.read()) != -1){  
            out.write(len);  
            out.flush();  
        }  
        out.close();  
        bis.close();
    } 
	
	
	
	@RequestMapping(value="score")
	public ModelAndView ShowScore(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		ModelAndView modelAndView = new ModelAndView("score");
		
		if(session.getAttribute("user")!=null) {
			User user =(User)session.getAttribute("user");
			List<Scores> scores = userService.getScores(user.getuID());
			modelAndView = new ModelAndView("score","scores",scores);
			return modelAndView;
		}
		return modelAndView;
	}
	
	
}
