package com.cg.oops;

class Animal
{
	int x;
	//non-parameterised constructor
	Animal()
	{
		x=10;
	}
	void display()
	{
		System.out.println("Lion"+x);
	}
}

public class NonParameterisedConstructor {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.display();

	}

}
