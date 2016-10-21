package com.tarun.academy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tarun.academy.model.Student;

@Repository
public interface StudentDAO{
	
	public void add(Student student);
	
	public List<Student> fetchAll();
	
	public Student fetchStudentById(int id);
	
	public void delete(Student student);
	
	public void update(Student student);
	
}
