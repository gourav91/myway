package com.tarun.academy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tarun.academy.model.Attendence;

@Repository
public interface AttendenceDAO {
	
	public void add(Attendence attendence);
	
	public List<Attendence> fetchAll();
	
	public Attendence fetchAttendenceById(int id);
	
	public void delete(Attendence attendence);
	
	public void update(Attendence attendence);
}
