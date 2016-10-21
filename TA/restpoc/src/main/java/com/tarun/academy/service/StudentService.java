package com.tarun.academy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tarun.academy.model.Student;

@Service
public interface StudentService {

	public void add(Student student);

	public List<Student> fetchAll();

	public Student fetchStudentById(int id);

	public void delete(Student student);

	public void update(Student student);

}
