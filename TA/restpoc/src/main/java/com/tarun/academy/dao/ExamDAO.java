package com.tarun.academy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tarun.academy.model.Exam;

@Repository
public interface ExamDAO {

	public void add(Exam exam);
	
	public List<Exam> fetchAll();
	
	public Exam fetchExamById(int id);
	
	public void delete(Exam exam);
	
	public void update(Exam exam);
}
