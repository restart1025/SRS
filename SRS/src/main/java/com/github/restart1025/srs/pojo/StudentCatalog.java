package com.github.restart1025.srs.pojo;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.restart1025.srs.domain.Section;
import com.github.restart1025.srs.domain.Student;
import com.github.restart1025.srs.mapper.StudentDao;

@Component
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class StudentCatalog{
	private ArrayList<Student> studentCatalog;
	private HashMap<String,Student> map;
	public StudentCatalog() {
		super();
		studentCatalog = new ArrayList<Student>();
		map = new HashMap<String,Student>();
	}
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private TranscriptCatalog transcript;
	@PostConstruct
	public void init(){
		ArrayList<Student> list=load();
		this.studentCatalog=list;
		int size=list.size();
		HashMap<String,Student> hashmap=new HashMap<String,Student>();
		//当直接map.put...时出错，加一个hashmap当介质没问题？？？？？？？？？？？？？？？？？？？？？？
		for(int i=0;i<size;i++){
			list.get(i).setTranscript(transcript.getMap().get(list.get(i).getSsn()));
			hashmap.put(list.get(i).getSsn(), list.get(i));
			
		}
		this.map=hashmap;
	}
	
	private ArrayList<Student> load() {
		// TODO Auto-generated method stub
		ArrayList<Student> list=studentDao.load();
		
		return list;
	}
	public void studentAddAttends(Student student, Section section) {
		map.get(student.getSsn()).getAttends().add(section);
	}
	public ArrayList<Student> getStudentCatalog() {
		return studentCatalog;
	}
	public void setStudentCatalog(ArrayList<Student> studentCatalog) {
		this.studentCatalog = studentCatalog;
	}
	public HashMap<String, Student> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Student> map) {
		this.map = map;
	}
	
	
}
