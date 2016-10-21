package com.tarun.academy.utils;

import com.tarun.academy.model.Student;
import com.tarun.academy.vo.StudentVO;

public class Utils {
	public static Student VOToEntity(StudentVO vo){
		Student student = new Student();
		student.setContactNumber(vo.getContactNumber());
		student.setGrade(vo.getGrade());
		student.setInstitute(vo.getInstitute());
		student.setName(vo.getName());
		student.setEmail(vo.getEmail());
		return student;
	}

}
