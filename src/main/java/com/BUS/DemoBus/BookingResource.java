package com.BUS.DemoBus;



import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("bookings")
public class BookingResource 
{
	BookingRepository bookrepo = new BookingRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Booking> getBooking() throws SQLException
	{
		return bookrepo.getBookings();
	}
	
	@POST
	@Path("booking")
	public Booking createBooking(Booking b1) throws SQLException
	{
		bookrepo.create(b1);
		return b1;
	}
	 
	

}
