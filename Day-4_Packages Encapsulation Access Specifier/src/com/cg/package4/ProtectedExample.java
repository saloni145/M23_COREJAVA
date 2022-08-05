package com.cg.package4;
class Car
{
	//if any variable and method is [protected] we can access inside the child class
	protected void print()
	{
		System.out.println("Hey , I am using Access Specifier");
	}
}
class Mercedese extends Car
{
	
	//Mercedese class is accessing the properties of car class
}
public class ProtectedExample {

	public static void main(String[] args) {
		Mercedese m=new Mercedese();
		m.print();
		
	}

}
