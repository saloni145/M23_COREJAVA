package com.cg.Recursion;

import java.util.Scanner;

public class FibonacciSeries {
	
	static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int a){    
	    if(a>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(a-1);    
	     }    
	 }    
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.close();
		  System.out.print(n1+" "+n2);//printing 0 and 1    
		  printFibonacci(a-2);
		  //a-2 because 2 numbers are already printed 
	 
	}

}
