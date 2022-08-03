package com.cg.oops;

import java.util.Scanner;

class Vehicle
{
	//variable
	public int a;
	//user-define method
	void display()
	{
		System.out.println("Welcome");
	}
}

public class RunTimeClassAndObject {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=s1.nextInt();
		
		//object creation
		Vehicle obj=new Vehicle();
		
	    //accessing the car class method
		obj.display();
		//obj.a=50;
		
		//accessing the car class variable
		System.out.println(a);
		s1.close();

	}

}
