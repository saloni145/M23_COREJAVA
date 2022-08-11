package com.cg.ThisKeyword;
//4.

class Main
{
	int x,y;
	//Default Constructor
	Main()
	{
		x=10;
		y=20;
	}
	Main get()
	{
		//this keyword is used to return current class instance variable
		return this;
		
	}
	public void display()
	{
		System.out.println("Addition Of x & y is:" + (x+y));
	}
}
public class CurrentClassInstance {

	public static void main(String[] args) {
	Main m = new Main();
	m.get().display();

	}

}
