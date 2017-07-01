package com.github.restart1025.srs.service;

import java.util.ArrayList;

import com.github.restart1025.srs.domain.Student;

public interface SelectSectionService {

	String selectSection(String ssn, int sectionNo);

	ArrayList<Student> queryEnrolledStudents(String sectionNo);

}
