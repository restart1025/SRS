package com.github.restart1025.srs.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.restart1025.srs.domain.Course;
import com.github.restart1025.srs.domain.Student;
import com.github.restart1025.srs.service.PlanOfStudyService;

@Controller
public class PlanOfStudyController {

	@Autowired
	private PlanOfStudyService planOfStudyService;
	
	@RequestMapping(value="/queryPlanOfStudy")
	@ResponseBody
	public List<Course> queryCourse( String ssn, HttpSession session ){
		
		Student student = (Student) session.getAttribute("student");
		
		return planOfStudyService.queryPlanOfStudy( student.getSsn() );
		
	}
	
}
