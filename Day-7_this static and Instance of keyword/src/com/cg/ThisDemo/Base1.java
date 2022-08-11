package com.cg.ThisDemo;

public abstract class Base1
{
	//default constructor
	Base1()
	{
		this(10);
		System.out.println("Default Constructor for Base1");
	}
	//parameterized
	Base1 (int i)
	{
		System.out.println("parameterised constructor for base1:"+i);
	}

}