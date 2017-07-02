package com.github.restart1025.srs.controller;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.restart1025.srs.domain.Course;
import com.github.restart1025.srs.service.CourseService;

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
		
		return courseService.queryCourse();
		
	}
	
	@RequestMapping(value="/queryPrevCourse")
	@ResponseBody
	public Object queryPrevCourse(String number){
		
		return courseService.queryPrevCourse(number);
		
	}
	
	@RequestMapping(value="/addCourse")
	@ResponseBody
	public boolean addCourse(@Param("course")Course course ,@Param("prevCourseNum")String prevCourseNum){

		if(prevCourseNum!=null)
		{
			String[] pNum = prevCourseNum.split(",");
			for(int i = 0; i < pNum.length; i++)
			{
				Course c = courseService.selectCourseByNum(pNum[i]);
				if( course.getPrevCourse() != null )
				{
					course.getPrevCourse().add(c);
				}else
				{
					ArrayList<Course> li = new ArrayList<Course>();
					li.add(c);
					course.setPrevCourse(li);
				}
				
			}
		}
		
		return courseService.addCourse(course);
	}
	
	@RequestMapping(value="/deleteCourse")
	@ResponseBody
	public boolean deleteCourse(String number){
		return courseService.deleteCourse(number);
	}		
}
