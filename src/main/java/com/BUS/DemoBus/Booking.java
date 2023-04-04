package com.BUS.DemoBus;



import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Booking 
{
	String passengerName;
    int busNo;
    String date;
	public String getPassengerName() 
	{
		return passengerName;
	}
	public void setPassengerName(String passengerName) 
	{
		this.passengerName = passengerName;
	}
	public int getBusNo() 
	{
		return busNo;
	}
	public void setBusNo(int busNo) 
	{
		this.busNo = busNo;
	}
	public String getDate() 
	{
		return date;
	}
	public void setDate(String date) 
	{
		this.date = date;
	}

}
