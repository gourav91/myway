package com.gourav.rest.practice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/xml/student")
public class XmlExample {
	@GET
	@Path("/get/{name}")
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent(@PathParam("name") String name,@QueryParam("age")int age){
		Student student = new Student();
		student.setAge(age);
		student.setName(name);
		return student;
	}
	
}
