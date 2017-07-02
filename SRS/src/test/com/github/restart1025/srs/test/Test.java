package com.github.restart1025.srs.test;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.github.restart1025.srs.domain.Course;
import com.github.restart1025.srs.service.PlanOfStudyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc-config.xml"})
@Transactional//事务回滚，测试成功后不会持久化到数据库（如果不需要可不加）
public class Test {

	@Autowired
	private PlanOfStudyService planOfStudyService;
	
	@org.junit.Test
	public void testPlanOfStudy(){
		
		List<Course> test = planOfStudyService.queryPlanOfStudy("09143604");
		
		System.out.println(Arrays.toString(test.toArray()));
		
	}
	
}
