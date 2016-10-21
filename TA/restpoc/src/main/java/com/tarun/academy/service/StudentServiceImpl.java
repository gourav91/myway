package com.tarun.academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarun.academy.dao.StudentDAO;
import com.tarun.academy.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentDAO;

	public void add(Student student) {
		studentDAO.add(student);
	}

	public List<Student> fetchAll() {
		return studentDAO.fetchAll();
	}

	public Student fetchStudentById(int id) {
		return studentDAO.fetchStudentById(id);
	}

	public void delete(Student student) {
		studentDAO.delete(student);
	}

	public void update(Student student) {
		studentDAO.update(student);
	}

}
