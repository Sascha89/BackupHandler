package de.sfranke.backuphandler.oauth.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/oauth")
public class OAuthRestServiceImpl {
	
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testMethod() {
		String testString = "Method Call works";
		return Response.status(200).entity(testString).build();
	}
	
	@GET
	@Path("/getAccessTokenGenerationForm")
	@Produces(MediaType.TEXT_HTML)
	public Response getAccessTokenGenerationForm() {
		String htmlForm = "";
		return Response.status(200).entity(htmlForm).build();
	}
}
