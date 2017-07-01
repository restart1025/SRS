package com.github.restart1025.srs.specification;

import org.springframework.stereotype.Service;

import com.github.restart1025.srs.domain.Course;
import com.github.restart1025.srs.domain.Section;
import com.github.restart1025.srs.domain.Student;
import com.github.restart1025.srs.domain.TranscriptEntity;

@Service("selectionSectionSpecification")
public class SelectionSectionSpecification implements Specification<Section> {
	@Override
	public String validate(Student student, Section section) {
		String result=null;
		boolean ifPlan=false;//培养计划是否包含该门课程
		boolean ifSelect=false;//是否已选该门课程
		boolean ifPrevCan=false;//这门课是否有先修课程以及是否选过先修课程
		for(Course course:student.getPlanOfStudy()){
			if(course.getNumber().equals(section.getCourse().getNumber())){
				ifPlan=true;
				break;
			}
		}
		if(ifPlan==true){//当培养计划包含这门课时进行是否选过这门课判断
			if(student.getAttends()==null){
				
			}else{
				for(Section s:student.getAttends()){
					if(s.getCourse().getNumber().equals(section.getCourse().getNumber())){
						ifSelect=true;
						break;
					}
				}
			}
		}
		if(ifPlan==true&&ifSelect==false){//当培养计划包含这门课并且未选过进行这门课的先修课程是否选过并及格判断
			if(section.getCourse().getPrevCourse()!=null){
				for(Course c:section.getCourse().getPrevCourse()){
					ifPrevCan=false;
					if(student.getTranscript()==null){
						
					}else{
						for(TranscriptEntity t:student.getTranscript()){
							if(t.getSection().getCourse().getNumber().equals(c.getNumber())&&t.getGrade()>=60){
								ifPrevCan=true;
							}
						}
					}
					if(ifPrevCan==false){
						result="先修课程不达标！";
						break;
					}
				}
			}
		}
		if(ifPlan==false){
			result="您的课程计划中不包含这门课程！";
			return result;
		}else if(section.getCapacity()<=section.getEnrolledStudents().size()){
			result="人数已满！";
			return result;
		}else if(ifSelect==true){
			result="您已经选过这门课程!";
			return result;
		}
		return result;
	}
}
