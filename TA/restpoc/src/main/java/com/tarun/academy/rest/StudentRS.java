package com.tarun.academy.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.tarun.academy.model.Student;
import com.tarun.academy.service.StudentService;
import com.tarun.academy.utils.Utils;
import com.tarun.academy.vo.StudentVO;

@Path("/students")
public class StudentRS {

	@Autowired
	StudentService studentService;

	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response add(StudentVO studentVO) {
		studentService.add(Utils.VOToEntity(studentVO));
		return Response.status(Response.Status.CREATED).build();
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response update(StudentVO studentVO) {
		studentService.update(Utils.VOToEntity(studentVO));
		return Response.status(Response.Status.OK).build();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response listStudents() {
		List<Student> students = studentService.fetchAll();
		return Response.status(Response.Status.OK).entity(students).build();
	}

	@GET
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getStudentById(int id) {
		Student student = studentService.fetchStudentById(id);
		return Response.status(Response.Status.OK).entity(student).build();
	}

	@DELETE
	public Response remove(StudentVO studentVO) {
		studentService.delete(Utils.VOToEntity(studentVO));
		return Response.status(Response.Status.OK).build();
	}
}
