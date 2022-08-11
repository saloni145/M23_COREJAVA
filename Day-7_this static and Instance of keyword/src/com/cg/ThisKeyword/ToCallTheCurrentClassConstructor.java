package com.cg.ThisKeyword;
//5.this keyword is used to call the current class constructor
class Z
{   
	public int x;
	//Default constructor
	Z()
	{
		this(20);//call the parameterized constructor
		System.out.println("Default Constructor");
	}
	//parameterized constructor
	Z(int x)
	{
		System.out.println("Value is:"+x);
	}
}
public class ToCallTheCurrentClassConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Z obj=new Z();

	}

}
