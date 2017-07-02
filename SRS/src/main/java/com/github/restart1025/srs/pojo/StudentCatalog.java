package com.github.restart1025.srs.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	private List<Student> studentCatalog;
	private Map<String,Student> map;
	
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
	public void init()
	{
		this.studentCatalog = load();
		
		int size = studentCatalog.size();
		
		for(int i = 0; i < size; i++)
		{
			studentCatalog.get(i).setTranscript( transcript.getMap().get( studentCatalog.get(i).getSsn() ) );
			
			this.map.put(studentCatalog.get(i).getSsn(), studentCatalog.get(i));
		}
	}
	
	private ArrayList<Student> load() 
	{
		return studentDao.load();
	}
	
	public void studentAddAttends(Student student, Section section) {
		map.get(student.getSsn()).getAttends().add(section);
	}
	public List<Student> getStudentCatalog() {
		return studentCatalog;
	}
	public void setStudentCatalog(ArrayList<Student> studentCatalog) {
		this.studentCatalog = studentCatalog;
	}
	public Map<String, Student> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Student> map) {
		this.map = map;
	}
	
	
}
