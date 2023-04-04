package com.BUS.DemoBus;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("buses")
public class BusResource 
{
	BusRepository busrepo = new BusRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Bus> getBuses() throws SQLException
	{
		return busrepo.getBuses();
	}
	@GET
	@Path("bus/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Bus getBusDetails(@PathParam("id") int id) throws SQLException
	{
		return busrepo.getBusDetails(id);
	}
}
