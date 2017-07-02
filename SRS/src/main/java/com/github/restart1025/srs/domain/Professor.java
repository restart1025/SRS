package com.github.restart1025.srs.domain;

import java.util.ArrayList;

public class Professor extends Person{
	
	private String title;//职称
	private String department;//学院
	private ArrayList<Section> teaches;//所教课程
	
	public Professor() {
		super();
	}
	public Professor(String ssn, String name) {
		super(ssn, name);
	}
	public Professor(String name,String ssn,String title, String department) {
		super(name,ssn);
		this.title = title;
		this.department = department;
		teaches=new ArrayList<Section>();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public ArrayList<Section> getTeaches() {
		return teaches;
	}
	public void setTeaches(ArrayList<Section> teaches) {
		this.teaches = teaches;
	}
	
}



