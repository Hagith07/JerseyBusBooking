package com.BUS.DemoBus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookingRepository 
{
	public List<Booking> getBookings() throws SQLException
	{
		List<Booking> bookings = new ArrayList<Booking>();
		String sql = "Select * from booking";
		Connection con = DatabaseConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
            Booking b = new Booking();
            b.setPassengerName(rs.getString(1));
            b.setBusNo(rs.getInt(2));
            b.setDate(rs.getString(3));
            bookings.add(b);
        }

        return bookings;
	}
	public void create(Booking b1) throws SQLException
	{
		String sql = "insert into booking values(?,?,?)";
		Connection con = DatabaseConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		//java.sql.Date sqldate = new java.sql.Date(b1.date.getTime());
        pst.setString(1, b1.passengerName);
        pst.setInt(2, b1.busNo);
        pst.setString(3, b1.date);
        pst.executeUpdate();
	}

}
