package com.tarun.academy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tarun.academy.model.Fee;

@Service
public interface FeeService {
	public void add(Fee fee);

	public List<Fee> fetchAll();

	public Fee fetchFeeById(int id);

	public void delete(Fee fee);

	public void update(Fee fee);
}
