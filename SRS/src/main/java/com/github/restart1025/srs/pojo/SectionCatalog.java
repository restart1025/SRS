package com.github.restart1025.srs.pojo;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.restart1025.srs.domain.Section;
import com.github.restart1025.srs.domain.Student;
import com.github.restart1025.srs.mapper.SectionDao;
import com.github.restart1025.srs.mapper.TranscriptDao;

@Component
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class SectionCatalog{
	private ArrayList<Section> sectionCatalog;
	private HashMap<String,Section> map;
	public SectionCatalog(ArrayList<Section> sectionCatalog,HashMap<String,Section> map) {
		super();
		sectionCatalog =new ArrayList<Section>();
		map=new HashMap<String,Section>();
	}
	
	public SectionCatalog() {
		super();
	}
	@Autowired
	private SectionDao sectionDao;
	@Autowired
	private TranscriptDao transcriptDao;
	@PostConstruct
	public void init(){
		ArrayList<Section> list=load();
		this.sectionCatalog=list;
		int size=list.size();
		HashMap<String,Section> hashmap=new HashMap<String,Section>();
		//当直接map.put...时出错，加一个hashmap当介质没问题
		for(int i=0;i<size;i++){
			hashmap.put(String.valueOf(list.get(i).getSectionNo()), list.get(i));
		}
		this.map=hashmap;
	}
	private ArrayList<Section> load() {
		ArrayList<Section> list=sectionDao.load();
		return list;
	}

	@PreDestroy
	public void preDestroy(){
		//在此执行批量更新数据库		
	}
	public void sectionAddEnrolledStudent(Student student, Section section) {
		map.get(String.valueOf(section.getSectionNo())).getEnrolledStudents().add(student);
		/*try{*/
			String ssn=student.getSsn();
			int sectionNo=section.getSectionNo();
			transcriptDao.add(ssn, sectionNo);
//		}catch(Exception e){
//			System.out.println("向section_student数据库里面插入出错");
//		}
		
	}
	public ArrayList<Section> getSectionCatalog() {
		return sectionCatalog;
	}

	public void setSectionCatalog(ArrayList<Section> sectionCatalog) {
		this.sectionCatalog = sectionCatalog;
	}

	public HashMap<String, Section> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Section> map) {
		this.map = map;
	}

	

	

	
	
}
