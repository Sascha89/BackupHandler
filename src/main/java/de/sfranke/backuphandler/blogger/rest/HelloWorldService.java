package de.sfranke.backuphandler.blogger.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//127.0.0.1/BackupHandler/rest/hello/print
@Path("/hello")
public class HelloWorldService{

	@GET
    @Path("/print")
	@Produces(MediaType.TEXT_PLAIN)
    public Response getMsg() {
		//@PathParam("name") String name
        //String output = "Welcome   : " + name;
		String output = "Welcome User!";
        return Response.status(200).entity(output).build();
    }
  
}