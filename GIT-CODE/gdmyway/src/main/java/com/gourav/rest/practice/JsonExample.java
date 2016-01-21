package com.gourav.rest.practice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/json/student")
public class JsonExample {
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getData() {
		System.out.println("JsonExample.getData()");
		Student student = new Student();
		student.setAge(24);
		student.setName("Gourav Dhiman");
		return student;

	}
	
	@POST
	@Path("/detail")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response detailStudent(Student student){
		System.out.println("JsonExample.detailStudent()");
		System.out.println("Student Name is : "+student.getName());
		System.out.println("Student Age is : "+student.getAge());
		String result = "Track saved : " + student;
		return Response.status(200).entity(result).build();
	}
	

	@PUT
	@Path("/putDetail")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response detailStudentPut(Student student){
		System.out.println("JsonExample.detailStudentPut()");
		System.out.println("Student Name is : "+student.getName());
		System.out.println("Student Age is : "+student.getAge());
		String result = "Track saved : " + student;
		return Response.status(200).entity(result).build();
	}

}
