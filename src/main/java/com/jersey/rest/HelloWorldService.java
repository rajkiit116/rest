package com.jersey.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	//@Path("/{param}")
	@Path("/details")
	@Produces(MediaType.APPLICATION_JSON)
	//public Response getMsg(@PathParam("param") String msg) {
	public Response getMsg() {
 
		String output = "Jersey say : " + "raj";
		
		//return new Person("Raj Mishra", 28,910100);
 
		return Response.status(200).entity(output).build();
 
	}
 
}