package com.tarun.academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tarun.academy.dao.ExamDAO;
import com.tarun.academy.model.Exam;

@Repository
public class ExamServiceImpl  implements ExamService{
	@Autowired
	ExamDAO examDAO;

	public void add(Exam Exam) {
		examDAO.add(Exam);
	}

	public List<Exam> fetchAll() {
		return examDAO.fetchAll();
	}

	public Exam fetchExamById(int id) {
		return examDAO.fetchExamById(id);
	}

	public void delete(Exam Exam) {
		examDAO.delete(Exam);
	}

	public void update(Exam Exam) {
		examDAO.update(Exam);
	}


}
