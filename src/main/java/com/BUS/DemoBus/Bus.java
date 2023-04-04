package com.BUS.DemoBus;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bus 
{
	int BusNo;
	boolean AC;
	int Capacity;
	public int getBusNo() {
		return BusNo;
	}
	public void setBusNo(int busNo) {
		BusNo = busNo;
	}
	public boolean isAC() {
		return AC;
	}
	public void setAC(boolean aC) {
		AC = aC;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

}
