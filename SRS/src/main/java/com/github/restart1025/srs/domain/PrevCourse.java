package com.github.restart1025.srs.domain;

public class PrevCourse{
	
	private Course course;
	private Course prevCourse;
	
	public PrevCourse() {
		super();
	}
	
	public PrevCourse(Course course, Course prevCourse) {
		super();
		this.course = course;
		this.prevCourse = prevCourse;
	}

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Course getPrevCourse() {
		return prevCourse;
	}
	public void setPrevCourse(Course prevCourse) {
		this.prevCourse = prevCourse;
	}
	
}
