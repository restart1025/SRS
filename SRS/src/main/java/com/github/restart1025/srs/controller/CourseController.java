package com.github.restart1025.srs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.github.restart1025.srs.domain.Course;
import com.github.restart1025.srs.service.CourseService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 对课程进行增删查改
 */
@Controller
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/queryCourse")
	@ResponseBody
	public Object queryCourse(){
		List<HashMap<String, String>> result=courseService.queryCourse();
		return result;
	}
	@RequestMapping(value="/queryPrevCourse")
	@ResponseBody
	public Object queryPrevCourse(String number){
		List<HashMap<String, String>> result=new ArrayList<HashMap<String ,String>>();
		result=courseService.queryPrevCourse(number);
		return result;
	}
	@RequestMapping(value="/addCourse")
	@ResponseBody
	public boolean addCourse(@Param("course")Course course ,@Param("prevCourseNum")String prevCourseNum){
		System.out.println(prevCourseNum);
		if(prevCourseNum!=null){
			String[] pNum=prevCourseNum.split(",");
			for(int i=0;i<pNum.length;i++){
				System.out.println(pNum[i]);
				Course c=courseService.selectCourseByNum(pNum[i]);
				if(course.getPrevCourse()!=null){
					course.getPrevCourse().add(c);
				}else{
					ArrayList<Course> li=new ArrayList<Course>();
					li.add(c);
					course.setPrevCourse(li);
				}
				
			}
		}
		
		boolean result=courseService.addCourse(course);
		return result;
	}
	@RequestMapping(value="/deleteCourse")
	@ResponseBody
	public boolean deleteCourse(String number){
		boolean result=courseService.deleteCourse(number);
		return result;
	}		
}
