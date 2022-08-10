package com.cg.AbstractKeywordDemo;
//concrete class
class Sweet extends Rasmalai
{
	public Sweet()
	{
		System.out.println("I like Rasmalai");
	}
	//non-abstract method
	public String taste()
	{
		return "Sweet";
	}
	//implementation for abstract method
	
	void display()
	{
		System.out.println("Sweet is Rasmalai");
	}
	

}