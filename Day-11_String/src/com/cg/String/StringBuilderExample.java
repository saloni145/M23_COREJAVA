package com.cg.String;

public class StringBuilderExample {

	public static void main(String[] args) 
	{
		//StringBuilder s=new StringBuilder("");
		//System.out.println(s); //No Output
		
		//StringBuilder s=new StringBuilder("Independence Day");
		//System.out.println(s);   //Output-Independence Day
		
		//String s="Monday";
		//StringBuilder sb=new StringBuilder(s.length());
		//System.out.println(sb.capacity()); //Output-6
		
		//StringBuilder sb=new StringBuilder("Today");
		//sb.append("Monday");
		//System.out.println(sb); //Output-TodayMonday
		
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity()); //Output-16
		sb.append("Sun");
		System.out.println(sb.capacity()); //Output-16
		sb.append("Today is Independence day");
		System.out.println(sb.capacity()); //Output-34

	}

}
