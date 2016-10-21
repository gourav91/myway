package com.tarun.academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tarun.academy.dao.FeeDAO;
import com.tarun.academy.model.Fee;

public class FeeServiceImpl implements FeeService{
	@Autowired
	FeeDAO FeeDAO;

	public void add(Fee fee) {
		FeeDAO.add(fee);
	}

	public List<Fee> fetchAll() {
		return FeeDAO.fetchAll();
	}

	public Fee fetchFeeById(int id) {
		return FeeDAO.fetchFeeById(id);
	}

	public void delete(Fee fee) {
		FeeDAO.delete(fee);
	}

	public void update(Fee fee) {
		FeeDAO.update(fee);
	}


}
