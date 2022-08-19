package com.cg.ExceptionHandling;

import java.util.Scanner;

public class ArithmaticExceptionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of b:");
		int x=s.nextInt();
		@SuppressWarnings("unused")
		int a=15;
		s.close();
         //if any exception will be there in a try block 
      		//that exception will handle by catch block
      		try
      		{
      			int res=15/x;
      			System.out.println(res);
      		}
      		catch(Exception e)
      		{
      			System.out.println("Exception Handled");
      		}
     
   
	}

}
