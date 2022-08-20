package com.cg.ArrayList_and_LinkedListPractice;

import java.util.*;
public class ArrayListPract2 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		ArrayList l=new ArrayList();
		l.add("Rita");
		l.add(3.14f);
		l.add(50);
		l.add("India is my Country");
		System.out.println(l);
		//clone is used for copy the list as it is
		Object abc;
		abc=l.clone();
		//System.out.println(l.clone());  OR
		System.out.println(abc);

	}

}