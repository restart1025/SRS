package com.github.restart1025.srs.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.restart1025.srs.domain.Professor;
import com.github.restart1025.srs.service.ProfessorService;
/**
 * 对教师进行增删查改
 */
@Controller
public class ProfessorController {
	
	@Autowired
	@Qualifier("professorService")
	private ProfessorService professorService;
	
	@RequestMapping(value="/addProfessor")
	@ResponseBody
	public boolean addProfessor(@ModelAttribute Professor professor){
		boolean result=professorService.addProfessor(professor);		
		return result;
	}
	
	@RequestMapping(value="/queryProfessor")
	@ResponseBody
	public  Object queryProfessor(){
		List<Professor> result=professorService.queryProfessor();
		return result;
	}
	
	@RequestMapping(value="/deleteProfessor")
	@ResponseBody
	public boolean deleteProfessor(String ssn,ModelAndView mv){
		boolean result=professorService.deleteProfessor(ssn);
		return result;
	}
	
	@RequestMapping(value="/updateProfessor")
	@ResponseBody
	public boolean updateProfessor(ModelAndView mv,
			@ModelAttribute Professor professor){
		boolean result=professorService.updateProfessor(professor);
		return result;
	}
}
