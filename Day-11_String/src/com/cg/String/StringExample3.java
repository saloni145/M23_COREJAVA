package com.cg.String;

public class StringExample3 {

	public static void main(String[] args)
	{
		//String str="Hello";
		//String str1="Hello";
		String str1=new String("Hello");
		String str2=new String("Hello");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));//it is not check memory
	}
}
