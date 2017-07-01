package com.github.restart1025.srs.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

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
	private ArrayList<Course> courseCatalog;
	private HashMap<String,Course> map;
	public CourseCatalog() {
		super();
		courseCatalog=new ArrayList<Course>();
		map=new HashMap<String,Course>();
		
	}
	@Autowired
	private CourseDao courseDao;
	@PostConstruct
	public void init(){
		ArrayList<Course> list=load();
		this.courseCatalog=list;
		int size=list.size();
		HashMap<String,Course> hashmap=new HashMap<String,Course>();
		for(int i=0;i<size;i++){
			hashmap.put(list.get(i).getNumber(), list.get(i));			
		}
		this.map=hashmap;
	}
	@PreDestroy
	public void preDestroy(){
		//在此执行批量更新数据库
		
	}
	/*加载数据库中数据*/
	private ArrayList<Course> load() {	
		ArrayList<Course> list=courseDao.load();
		return list;
	}
	/*添加课程*/
	public boolean addCourse(Course course) {
		// TODO Auto-generated method stub
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
	public ArrayList<Course> getCourseCatalog() {
		return courseCatalog;
	}
	public boolean deleteCourse(String number) {
		// TODO Auto-generated method stub
		try{
			for(Course course:courseCatalog){
				if(course.getNumber().equals(number)){
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
	public HashMap<String, Course> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Course> map) {
		this.map = map;
	}

	
}
