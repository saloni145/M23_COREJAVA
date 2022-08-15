package com.cg.Polymorphism;

//program on Compile time
//Function OverLoading
class A
{
	//by having the different types(DataTypes) of arguments
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
}
public class CompileTime {

	public static void main(String[] args) {
		A obj=new A();
		obj.add(2, 5);
		obj.add(3.0f, 4.2f);
	}

}
