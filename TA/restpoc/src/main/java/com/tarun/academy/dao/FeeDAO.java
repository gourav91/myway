package com.tarun.academy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tarun.academy.model.Fee;

@Repository
public interface FeeDAO {
	
	public void add(Fee Fee);
	
	public List<Fee> fetchAll();
	
	public Fee fetchFeeById(int id);
	
	public void delete(Fee Fee);
	
	public void update(Fee Fee);

}
