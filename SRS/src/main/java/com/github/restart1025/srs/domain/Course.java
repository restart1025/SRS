package com.github.restart1025.srs.domain;

import java.util.ArrayList;

public class Course{
	private String number;
	private String name;
	private double credits;//学分
	private ArrayList<Course> prevCourse;//先修课程
	
	public Course() {
		super();
	}
	public Course(String number, String name, double credits, ArrayList<Course> prevCourse) {
		super();
		this.number = number;
		this.name = name;
		this.credits = credits;
		prevCourse = new ArrayList<Course>();
	}
	
	
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	public ArrayList<Course> getPrevCourse() {
		return prevCourse;
	}
	public void setPrevCourse(ArrayList<Course> prevCourse) {
		this.prevCourse = prevCourse;
	}
}
