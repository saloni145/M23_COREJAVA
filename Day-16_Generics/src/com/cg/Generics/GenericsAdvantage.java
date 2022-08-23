package com.cg.Generics;
//Demo on Advantages Of Generic
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantage
{

	public static void main(String[] args) {
		List<Integer>obj=new LinkedList<Integer>();
		obj.add(11);
		obj.add(12);
		
		//1&3.Compile-Time checking and Type Safe
		//obj.add("Devyani");
		
		System.out.println(obj);
		
		//2.Type-Casting is not required in Generics
		
		List<String>obj1=new LinkedList<String>();
		obj1.add("Devyani");
		obj1.add("Kasar");
		String str=obj1.get(1);
		//type-casting explicitly if there is not an object -type
		//String str1=(String)obj1.get(1);
		System.out.println(str);

	}

}	
