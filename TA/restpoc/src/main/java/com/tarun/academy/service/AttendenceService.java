package com.tarun.academy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tarun.academy.model.Attendence;

@Service
public interface AttendenceService {

	public void add(Attendence attendence);

	public List<Attendence> fetchAll();

	public Attendence fetchAttendenceById(int id);

	public void delete(Attendence attendence);

	public void update(Attendence attendence);

	
}
