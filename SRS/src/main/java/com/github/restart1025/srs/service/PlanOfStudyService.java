package com.github.restart1025.srs.service;

import java.util.List;

import com.github.restart1025.srs.domain.Course;

public interface PlanOfStudyService {

	List<Course> queryPlanOfStudy( String ssn );
	
}
