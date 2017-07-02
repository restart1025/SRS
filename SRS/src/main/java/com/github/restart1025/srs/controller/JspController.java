package com.github.restart1025.srs.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 动态页面跳转控制器
 */
@Controller
public class JspController {
	
	@RequestMapping(value="/{formName}")
	public String jspReturn(@PathVariable String formName){
		return formName;		
	}
	
	@RequestMapping(value="/")
	public String loginReturn(){
		return "login";		
	}
}
