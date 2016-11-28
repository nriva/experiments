package com.mkyong.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/hello")
@Produces("text/plain")
public class HelloWorldService {
 
	@GET
	@Path("/{param1}/{param2}")
	public Response getMsg(@PathParam("param1") String param1,@PathParam("param2") String param2) {
 
		String output = "Jersey say : " + param1 + " " + param2;
 
		return Response.status(200).entity(output).build();
 
	}
 
}