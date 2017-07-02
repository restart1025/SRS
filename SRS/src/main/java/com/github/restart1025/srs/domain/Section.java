package com.github.restart1025.srs.domain;

import java.util.ArrayList;


public class Section {
	private int sectionNo;
	private String dayOfWeek;//周几
	private String timeOfDay;//第几节课
	private String room;//教室地点
	private int capacity;//容量
	private Course course;//课程
	private Professor professor;//教师
	private ArrayList<Student> enrolledStudents;//注册学生HashMap存储学生对象引用
	
	public Section() {
		super();
	}
	
	public Section(int sectionNo, String dayOfWeek, String timeOfDay, String room, int capacity, Course course,
			Professor professor) {
		super();
		this.sectionNo = sectionNo;
		this.dayOfWeek = dayOfWeek;
		this.timeOfDay = timeOfDay;
		this.room = room;
		this.capacity = capacity;
		this.course = course;
		this.professor = professor;
		this.enrolledStudents = new ArrayList<Student>();
	}
	
	public int getSectionNo() {
		return sectionNo;
	}
	public void setSectionNo(int sectionNo) {
		this.sectionNo = sectionNo;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getTimeOfDay() {
		return timeOfDay;
	}
	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public ArrayList<Student> getEnrolledStudents() {
		return enrolledStudents;
	}
	public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	
}
