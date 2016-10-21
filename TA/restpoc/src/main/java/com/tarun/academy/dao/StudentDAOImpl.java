package com.tarun.academy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tarun.academy.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@PersistenceContext(unitName = "ta-entities-persistence")
	private EntityManager eman;

	@Transactional
	public void add(Student student) {
		eman.persist(student);
	}

	
	public List<Student> fetchAll() {
		TypedQuery<Student> query = eman.createQuery("SELECT s from Student s", Student.class);
		return query.getResultList();
	}

	public Student fetchStudentById(int id) {
		if (id == 0)
			return null;
		Student student = eman.find(Student.class, id);
		return student;
	}

	@Transactional
	public void delete(Student student) {
		eman.remove(student);
	}

	@Transactional
	public void update(Student student) {
		eman.merge(student);
		eman.flush();
	}

}
