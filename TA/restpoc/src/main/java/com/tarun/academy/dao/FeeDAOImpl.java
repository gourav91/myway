package com.tarun.academy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tarun.academy.model.Fee;

@Repository
public class FeeDAOImpl implements FeeDAO {

	@PersistenceContext(unitName = "ta-entities-persistence")
	private EntityManager eman;

	@Transactional
	public void add(Fee Fee) {
		eman.persist(Fee);
	}

	
	public List<Fee> fetchAll() {
		TypedQuery<Fee> query = eman.createQuery("SELECT s from Fee s", Fee.class);	
		return query.getResultList();
	}

	public Fee fetchFeeById(int id) {
		if (id == 0)
			return null;
		Fee Fee = eman.find(Fee.class, id);
		return Fee;
	}

	@Transactional
	public void delete(Fee Fee) {
		eman.remove(Fee);
	}

	@Transactional
	public void update(Fee Fee) {
		eman.merge(Fee);
		eman.flush();
	}

}
