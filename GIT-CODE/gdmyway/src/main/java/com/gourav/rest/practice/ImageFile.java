package com.gourav.rest.practice;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/image")
public class ImageFile {

	@GET
	@Path("/get")
	@Produces("image/png")
	public Response getImage(){
		File file = new File("c://test.png");
		ResponseBuilder responseBuilder=Response.ok((Object)file);
		responseBuilder.header("Content-Disposition",
				"attachment; filename=\"test.png\"");
		
		return responseBuilder.build();
	}
}
