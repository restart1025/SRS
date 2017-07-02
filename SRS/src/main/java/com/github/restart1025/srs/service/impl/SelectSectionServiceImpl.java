package com.github.restart1025.srs.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.restart1025.srs.domain.Section;
import com.github.restart1025.srs.domain.Student;
import com.github.restart1025.srs.domain.TranscriptEntity;
import com.github.restart1025.srs.pojo.SectionCatalog;
import com.github.restart1025.srs.pojo.StudentCatalog;
import com.github.restart1025.srs.pojo.TranscriptCatalog;
import com.github.restart1025.srs.service.SelectSectionService;
import com.github.restart1025.srs.specification.Specification;
@Service("selectSectionService")
public class SelectSectionServiceImpl implements SelectSectionService {
	
	@Autowired
	@Qualifier("selectionSectionSpecification")
	private Specification<Section> selectionSectionSpecification;
	
	@Autowired
	private SectionCatalog sectionCatalog;
	
	@Autowired
	private StudentCatalog studentCatalog;
	
	@Autowired  
	private TranscriptCatalog transcript;
	
	@Override
	public String selectSection(String ssn, int sectionNo) {
		Section section=sectionCatalog.getMap().get(String.valueOf(sectionNo));
		Student student=studentCatalog.getMap().get(ssn);
		
		String result=selectionSectionSpecification.validate(student,section);
		if(result == null)
		{
			sectionCatalog.sectionAddEnrolledStudent(student,section);
			studentCatalog.studentAddAttends(student,section);
			TranscriptEntity entity=new TranscriptEntity(0.0,student,section);
			transcript.getMap().get(ssn).add(entity);
			result="选课成功！";
		}else{			
			return result;
		}
		return result; 
	}
	
	@Override
	public ArrayList<Student> queryEnrolledStudents(String sectionNo) 
	{
		Section section=sectionCatalog.getMap().get(sectionNo);
		int size=section.getEnrolledStudents().size();
		ArrayList<Student> list=new ArrayList<Student>();
		for(int i=0;i<size;i++){
			Student s=new Student(section.getEnrolledStudents().get(i).getSsn(),section.getEnrolledStudents().get(i).getName(),"",
					section.getEnrolledStudents().get(i).getDegree(),section.getEnrolledStudents().get(i).getMajor());
			list.add(s);
		}
		return list;
	}

}
