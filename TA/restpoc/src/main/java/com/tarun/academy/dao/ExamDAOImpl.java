package com.tarun.academy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tarun.academy.model.Exam;

@Repository
public class ExamDAOImpl implements ExamDAO {

	@PersistenceContext(unitName = "ta-entities-persistence")
	private EntityManager eman;

	@Transactional
	public void add(Exam exam) {
		eman.persist(exam);
	}

	
	public List<Exam> fetchAll() {
		TypedQuery<Exam> query = eman.createQuery("SELECT e from Exam e", Exam.class);
		return query.getResultList();
	}

	public Exam fetchExamById(int id) {
		if (id == 0)
			return null;
		Exam exam = eman.find(Exam.class, id);
		return exam;
	}

	@Transactional
	public void delete(Exam exam) {
		eman.remove(exam);
	}

	@Transactional
	public void update(Exam exam) {
		eman.merge(exam);
		eman.flush();
	}

}
