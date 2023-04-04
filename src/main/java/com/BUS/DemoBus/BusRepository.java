package com.BUS.DemoBus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BusRepository 
{
	public List<Bus> getBuses() throws SQLException
	{
		List<Bus> buses = new ArrayList<Bus>();
		String sql = "Select * from bus";
		Connection con = DatabaseConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
            Bus b = new Bus();
            b.setBusNo(rs.getInt(1));
            b.setAC(rs.getBoolean(2));
            b.setCapacity(rs.getInt(3));
            buses.add(b);
        }

        return buses;
	}
	public Bus getBusDetails(int BusNo) throws SQLException
	{
		String sql = "Select * from bus where id ="+BusNo;
		Connection con = DatabaseConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        Bus b = new Bus();
        if(rs.next())
        {
        	b.setBusNo(rs.getInt(1));
            b.setAC(rs.getBoolean(2));
            b.setCapacity(rs.getInt(3));
        }
        return b;
	}

}
