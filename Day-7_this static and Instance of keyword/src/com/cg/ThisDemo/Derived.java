package com.cg.ThisDemo;

public class Derived extends Base1 
{ 
	Derived()
	{
		System.out.println("Default Constructor for Derived");
	}
	Derived (int i)
	{
		this();
		System.out.println("Parameterized Constructor for Derived"+i);
	}

}