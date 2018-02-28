package de.sfranke.backuphandler;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface BackupRestService {
	
	
	@GET
	@Path("/start")
	@Produces(MediaType.TEXT_PLAIN)
	/**
	 * Requests all public information of service and saves them to local storage
	 * @return Response String representing the status of the backup process
	 */
	public Response startBackup();

	@GET
	@Path("/getLatestBackupDate")
	@Produces(MediaType.TEXT_PLAIN)
	/**
	 * Returns the date when the latest backup has been performed.
	 * @return Response date as String
	 */
	public Response getLatestBackupDate();
}
