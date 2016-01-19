package com.gourav.rest.practice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/Hello")
public class FirstExample {
	@GET
	@Path("/{name}")
	public Response getMessage(@PathParam("name") String name){
		String output = "Hi " + name;
		return Response.status(200).entity(output).build();
	}

}
