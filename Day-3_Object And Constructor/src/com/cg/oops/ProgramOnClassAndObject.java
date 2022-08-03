package com.cg.oops;
//demo on how to use the class and object

class Car
{
	//variable
	int a;
	//user-define method
	void display()
	{
		System.out.println("Welcome");
	}
}


public class ProgramOnClassAndObject {

	public static void main(String[] args) {
		//object creation
		Car obj=new Car();
		//accessing the car class method
		obj.display();
		obj.a=50;
		//accessing the car class variable
		System.out.println(obj.a);
		

	}

}
