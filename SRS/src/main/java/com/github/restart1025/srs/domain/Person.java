package com.github.restart1025.srs.domain;

import java.io.Serializable;

public abstract class Person{
	private String ssn;

	private String name;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
