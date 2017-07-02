package com.github.restart1025.srs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.restart1025.srs.domain.Course;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public interface PlanOfStudyDao {

	@Select("SELECT DISTINCT c.* FROM course c LEFT JOIN planofstudy p ON p.number = c.number WHERE p.ssn = #{ssn}")
	List<Course> queryPlanOfStudy( String ssn );
	
}
