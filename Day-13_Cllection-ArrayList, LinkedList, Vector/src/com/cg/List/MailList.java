package com.cg.List;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

class Address
{
	private int PlotNo;
	private String Street;
	private String Area;
	private String City;;
	private String State;
	public Address(int plotNo, String street, String area, String city, String state) {
		super();
		PlotNo = plotNo;
		Street = street;
		Area = area;
		City = city;
		State = state;
	}
	@Override
	public String toString() {
		return String.format("Address [PlotNo=%s, Street=%s, Area=%s, City=%s, State=%s]", PlotNo, Street, Area, City,
				State);
	}
	
	
}

public class MailList {

	public static void main(String[] args) {
		List<Address>obj=new LinkedList<>();
		obj.add(new Address(121,"Lane no2","Airoli","NaviMumbai","Maharashtra"));
		obj.add(new Address(231,"Lane no3","Kharadi","Pune","Maharashtra"));
		@SuppressWarnings("rawtypes")
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			Object elem=i.next();
			System.out.println(elem+"\n");
		}
		System.out.println();
	}

}
