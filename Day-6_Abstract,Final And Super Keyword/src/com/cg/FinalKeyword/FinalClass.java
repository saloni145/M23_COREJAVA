package com.cg.FinalKeyword;
//we can't extends final class
//final class Vehicle
class Vehicle
{
	void display()
	{
		System.out.println("Vehicle Type");
	}
}
class Bike extends Vehicle
{
	void print()
	{
		System.out.println("Bike");

	}
}
public class FinalClass {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.print();
		b.display();

	}

}