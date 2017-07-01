package com.github.restart1025.srs.mapper;
import org.apache.ibatis.annotations.*;
import java.util.ArrayList;

import org.apache.ibatis.mapping.FetchType;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.restart1025.srs.domain.Section;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public interface SectionDao {
	@Select("select * from section where professor_sn = #{ssn}")
	@Results({
	/*	@Result(id=true,column="sectionNo",property="sectionNo"),
		@Result(column="dayOfWeek",property="dayOfWeek"),
		@Result(column="timeOfDay",property="timeOfDay"),
		@Result(column="room",property="room"),
		@Result(column="capacity",property="capacity"),*/
		@Result(column="course_number",property="course",
		one=@One(select="com.github.restart1025.srs.mapper.CourseDao.selectCourseByNum",
				fetchType=FetchType.LAZY))
	})
	ArrayList<Section> selectByProfessorSsn(String ssn);
	
	@Select("select * from section")
	@Results({
		@Result(id=true,column="sectionNo",property="sectionNo"),
		@Result(column="course_number",property="course",
		one=@One(select="com.github.restart1025.srs.mapper.CourseDao.selectCourseByNum",
				fetchType=FetchType.EAGER)),
		@Result(column="professor_sn",property="professor",
		one=@One(select="com.github.restart1025.srs.mapper.ProfessorDao.selectProfessorBySsn",
				fetchType=FetchType.EAGER)),
		@Result(column="sectionNo",property="enrolledStudents",
		many=@Many(select="com.github.restart1025.srs.mapper.StudentDao.selectStudentBySectionNo",
				fetchType=FetchType.LAZY))
	})
	ArrayList<Section> load();
	
	@Select("select * from section where sectionNo in (select sectionNo from transcriptentity where student_ssn=#{ssn})")
	@Results({
		@Result(id=true,column="sectionNo",property="sectionNo"),
		@Result(column="course_number",property="course",
		one=@One(select="com.github.restart1025.srs.mapper.CourseDao.selectCourseByNum",
				fetchType=FetchType.EAGER)),
		@Result(column="professor_sn",property="professor",
		one=@One(select="com.github.restart1025.srs.mapper.ProfessorDao.selectProfessorBySsn",
				fetchType=FetchType.EAGER)),
		@Result(column="sectionNo",property="enrolledStudents",
		many=@Many(select="com.github.restart1025.srs.mapper.StudentDao.selectStudentBySectionNo",
				fetchType=FetchType.LAZY))
	})
	ArrayList<Section> selectByStudentSn(String ssn);
	
	@Select("select * from section where sectionNo =#{sectionNo}")
	@Results({
		@Result(id=true,column="sectionNo",property="sectionNo"),
		@Result(column="course_number",property="course",
		one=@One(select="com.github.restart1025.srs.mapper.CourseDao.selectCourseByNum",
				fetchType=FetchType.EAGER)),
		@Result(column="professor_sn",property="professor",
		one=@One(select="com.github.restart1025.srs.mapper.ProfessorDao.selectProfessorBySsn",
				fetchType=FetchType.EAGER)),
		@Result(column="sectionNo",property="enrolledStudents",
		many=@Many(select="com.github.restart1025.srs.mapper.StudentDao.selectStudentBySectionNo",
				fetchType=FetchType.LAZY))
	})
	Section selectBySectionNo(int sectionNo);
}
