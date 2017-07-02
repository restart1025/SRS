package com.github.restart1025.srs.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.restart1025.srs.domain.Course;
import com.github.restart1025.srs.mapper.CourseDao;

@Component
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class CourseCatalog{
	
	private List<Course> courseCatalog;
	private Map<String,Course> map;
	
	public CourseCatalog() {
		super();
		courseCatalog = new ArrayList<Course>();
		map = new HashMap<String,Course>();
	}
	
	@Autowired
	private CourseDao courseDao;
	
	@PostConstruct
	public void init(){
		
		this.courseCatalog = load();
		
		int size = courseCatalog.size();
		
		for(int i = 0; i < size; i++)
		{
			this.map.put(courseCatalog.get(i).getNumber(), courseCatalog.get(i));			
		}
	}
	
	@PreDestroy
	public void preDestroy(){
		
	}
	/**
	 * 加载数据
	 * @return
	 */
	private ArrayList<Course> load() {	
		return courseDao.load();
	}
	/**
	 * 添加课程
	 * @param course
	 * @return
	 */
	public boolean addCourse(Course course) {
		courseCatalog.add(course);
		map.put(course.getNumber(), course);
		try{
			courseDao.insertCourse(course);
			if(course.getPrevCourse()!=null){
				for(Course pc:course.getPrevCourse()){
					String prev_number=pc.getNumber();
					String number=course.getNumber();
					courseDao.insertPrevCourse(number,prev_number);
				}
			}
		}catch( Exception e){
			System.out.println(e);
			return false;
		}
		return true;
	}
	/**
	 * 删除课程
	 * @param number
	 * @return
	 */
	public boolean deleteCourse(String number) {
		
		try{
			
			for(Course course:courseCatalog)
			{
				if( course.getNumber().equals(number) )
				{
					courseCatalog.remove(course);
					break;
				}
			}
			
			courseDao.deleteCourseByNumber(number);
			
		}catch( Exception e){
			
			System.out.println(e);
			return false;
			
		}
		return true;
	}
	public Map<String, Course> getMap() {
		return map;
	}
	public void setMap(Map<String, Course> map) {
		this.map = map;
	}
	public List<Course> getCourseCatalog() {
		return courseCatalog;
	}
	
}
