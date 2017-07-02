package com.github.restart1025.srs.domain;

public class TranscriptEntity{
	
	private int id;
	private double grade;
	private Student student;
	private Section section;
	
	public TranscriptEntity() {
		super();
	}
	
	public TranscriptEntity(double grade, Student student, Section section) {
		super();
		this.grade = grade;
		this.student = student;
		this.section = section;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
}
