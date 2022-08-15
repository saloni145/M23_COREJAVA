package com.cg.Polymorphism;

//program on method overloading/compileTime
class Shape
{
	//by changing the number of arguments/Parameter
	int area(int a)
	{
		return a*a;
	}
	int area(int a,int b)
	{
		return a*b;
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		Shape s =new Shape();
		System.out.println(s.area(5));
		System.out.println(s.area(10, 20));

	}

}
