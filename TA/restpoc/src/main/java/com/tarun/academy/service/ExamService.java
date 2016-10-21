package com.tarun.academy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tarun.academy.model.Exam;

@Service
public interface ExamService {
	public void add(Exam Exam);

	public List<Exam> fetchAll();

	public Exam fetchExamById(int id);

	public void delete(Exam Exam);

	public void update(Exam Exam);

}
