package com.gourav.rest.practice;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/Hello")
public class FirstExample {
	@GET
	@Path("/{name}")
	public Response getMessage(@PathParam("name") String name) {
		String output = "Hi " + name;
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/queryparam")
	public Response getMessageByQueryParam(@QueryParam("name") String name) {
		String output = "Hi " + name;
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/matrixparam")
	public Response getMessageByMatrixParam(@MatrixParam("name") String name) {
		String output = "Hi " + name;
		return Response.status(200).entity(output).build();
	}
	
	@POST
	@Path("/formparam")
	public Response getMessageByFormParam(@FormParam("name") String name) {
		String output = "Hi " + name;
		return Response.status(200).entity(output).build();
	}

}
