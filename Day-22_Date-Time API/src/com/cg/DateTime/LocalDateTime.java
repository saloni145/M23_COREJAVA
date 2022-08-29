package com.cg.DateTime;

import java.time.Month;

public class LocalDateTime {

	public static void main(String[] args) {
		//LocalDate l=LocalDate.now();
		//LocalTime t=LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		LocalDateTime d=LocalDateTime.of(2022,Month.APRIL,31);
		//System.out.println(l);
		//System.out.println(t);
		System.out.println(dt);
		System.out.println(d);
	}

	private static LocalDateTime now() {
		// TODO Auto-generated method stub
		return null;
	}

	private static LocalDateTime of(int i, Month april, int j) {
		
		return null;
	}

}