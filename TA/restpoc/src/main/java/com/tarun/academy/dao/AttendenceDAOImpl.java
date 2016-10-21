package com.tarun.academy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tarun.academy.model.Attendence;

@Repository
public class AttendenceDAOImpl implements AttendenceDAO {

	
	@PersistenceContext(unitName = "ta-entities-persistence")
	private EntityManager eman;

	@Transactional
	public void add(Attendence attendence) {
		eman.persist(attendence);
	}

	
	public List<Attendence> fetchAll() {
		TypedQuery<Attendence> query = eman.createQuery("SELECT a from Attendence a", Attendence.class);
		return query.getResultList();
	}

	public Attendence fetchAttendenceById(int id) {
		if (id == 0)
			return null;
		Attendence attendence = eman.find(Attendence.class, id);
		return attendence;
	}

	@Transactional
	public void delete(Attendence attendence) {
		eman.remove(attendence);
	}

	@Transactional
	public void update(Attendence attendence) {
		eman.merge(attendence);
		eman.flush();
	}
}
