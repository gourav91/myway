package com.tarun.academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarun.academy.dao.AttendenceDAO;
import com.tarun.academy.model.Attendence;

@Service
public class AttendenceServiceImpl implements AttendenceService{
	@Autowired
	AttendenceDAO attendenceDAO;

	public void add(Attendence Attendence) {
		attendenceDAO.add(Attendence);
	}

	public List<Attendence> fetchAll() {
		return attendenceDAO.fetchAll();
	}

	public Attendence fetchAttendenceById(int id) {
		return attendenceDAO.fetchAttendenceById(id);
	}

	public void delete(Attendence Attendence) {
		attendenceDAO.delete(Attendence);
	}

	public void update(Attendence Attendence) {
		attendenceDAO.update(Attendence);
	}

}
