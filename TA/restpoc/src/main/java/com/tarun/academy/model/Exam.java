package com.tarun.academy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXAM")
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String month;
	
	private String examType;
	
	private String examName;
	
	private String subject;
	
	private String maximumMarks;
	
	private String obtainedMarks;
	
	private String passingMarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMaximumMarks() {
		return maximumMarks;
	}

	public void setMaximumMarks(String maximumMarks) {
		this.maximumMarks = maximumMarks;
	}

	public String getObtainedMarks() {
		return obtainedMarks;
	}

	public void setObtainedMarks(String obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}

	public String getPassingMarks() {
		return passingMarks;
	}

	public void setPassingMarks(String passingMarks) {
		this.passingMarks = passingMarks;
	}

}
