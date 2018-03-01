package de.sfranke.backuphandler.blogger.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.sfranke.backuphandler.BackupRestService;

//GET http://127.0.0.1/BackupHandler/rest/v1.0/blogger/backup/start
//GET http://127.0.0.1/BackupHandler/rest/v1.0/blogger/backup/getLatestBackupDate

@Path("/blogger/backup")
public class BloggerBackupRestServiceImpl implements BackupRestService{

	@GET
	@Path("/start")
	public Response startBackup() {
		//TODO
		return Response.status(200).entity("Backup succeeded").build();
	}
	
	@GET
	@Path("/getLatestBackupDate")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public Response getLatestBackupDate() {
		// TODO Auto-generated method stub
		String latestBackupDate = "2018-01-01 01:00:00";
		return Response.status(200).entity(latestBackupDate).build();
	}
}