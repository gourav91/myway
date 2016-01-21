package com.gourav.rest.practice;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/file")
public class TextFileExample {
     
	@GET
	@Path("/get")
	@Produces("text/plain")
	public Response getFile() {
		File file = new File("c:\\test.json");
		ResponseBuilder responseBuilder = Response.ok((Object)file);
		responseBuilder.header("Content-Disposition",
				"attachment; filename=\"test.json\"");
		return responseBuilder.build();
		
	}
}
