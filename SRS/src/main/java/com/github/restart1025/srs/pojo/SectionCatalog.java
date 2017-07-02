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

import com.github.restart1025.srs.domain.Section;
import com.github.restart1025.srs.domain.Student;
import com.github.restart1025.srs.mapper.SectionDao;
import com.github.restart1025.srs.mapper.TranscriptDao;

@Component
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class SectionCatalog{
	
	private List<Section> sectionCatalog;
	private Map<String,Section> map;
	
	public SectionCatalog(ArrayList<Section> sectionCatalog, HashMap<String,Section> map) {
		super();
		sectionCatalog = new ArrayList<Section>();
		map = new HashMap<String, Section>();
	}
	
	public SectionCatalog() {
		super();
		sectionCatalog = new ArrayList<Section>();
		map = new HashMap<String, Section>();
	}
	
	@Autowired
	private SectionDao sectionDao;
	
	@Autowired
	private TranscriptDao transcriptDao;
	
	@PostConstruct
	public void init()
	{
		this.sectionCatalog = load();
		
		int size = sectionCatalog.size();
		
		for(int i = 0; i < size; i++)
		{
			this.map.put(String.valueOf(sectionCatalog.get(i).getSectionNo()), sectionCatalog.get(i));
		}
	}
	/**
	 * 加载数据
	 * @return
	 */
	private ArrayList<Section> load() 
	{
		return sectionDao.load();
	}

	@PreDestroy
	public void preDestroy(){
			
	}
	/**
	 * 课程中增加选课学生
	 * @param student
	 * @param section
	 */
	public void sectionAddEnrolledStudent(Student student, Section section) 
	{
		
		map.get( String.valueOf(section.getSectionNo()) ).getEnrolledStudents().add(student);
		
		transcriptDao.add(student.getSsn(), section.getSectionNo());
		
	}
	public List<Section> getSectionCatalog() {
		return sectionCatalog;
	}

	public void setSectionCatalog(ArrayList<Section> sectionCatalog) {
		this.sectionCatalog = sectionCatalog;
	}

	public Map<String, Section> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Section> map) {
		this.map = map;
	}

	

	

	
	
}
