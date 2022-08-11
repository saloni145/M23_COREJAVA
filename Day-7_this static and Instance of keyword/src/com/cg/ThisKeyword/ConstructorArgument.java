package com.cg.ThisKeyword;
//2.this keyword can be passes as an argument in the constructor call
class A
{
	public int a;
	A()
	{
		System.out.println("welcome");
	}
	A(int a)
	{
		this.a=a;
	}
}
public class ConstructorArgument {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		A a=new A();
		A obj=new A(5);
		System.out.println("The value of a is: "+obj.a);
	}

}