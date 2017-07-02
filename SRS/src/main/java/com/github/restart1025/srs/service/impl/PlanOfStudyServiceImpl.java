package com.github.restart1025.srs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.restart1025.srs.domain.Course;
import com.github.restart1025.srs.mapper.PlanOfStudyDao;
import com.github.restart1025.srs.service.PlanOfStudyService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("planOfStudyService")
public class PlanOfStudyServiceImpl implements PlanOfStudyService {

	@Autowired
	private PlanOfStudyDao planOfStudyDao;
	
	@Override
	public List<Course> queryPlanOfStudy(String ssn) {
		return planOfStudyDao.queryPlanOfStudy(ssn);
	}

}
