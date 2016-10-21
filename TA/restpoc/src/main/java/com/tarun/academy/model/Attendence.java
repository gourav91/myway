package com.tarun.academy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Attendence")
public class Attendence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String month;
	
	private String year;
	
	private int daysPresent;
	
	private int daysAbsent;
	
	private int workingDays;

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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getDaysPresent() {
		return daysPresent;
	}

	public void setDaysPresent(int daysPresent) {
		this.daysPresent = daysPresent;
	}

	public int getDaysAbsent() {
		return daysAbsent;
	}

	public void setDaysAbsent(int daysAbsent) {
		this.daysAbsent = daysAbsent;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}
	
	
	

}
