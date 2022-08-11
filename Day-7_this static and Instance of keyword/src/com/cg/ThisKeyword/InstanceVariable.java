package com.cg.ThisKeyword;
//1. this keyword is used to refer the instance variable of current class
class X
{
	int m1,m2;
	
	 public void print(int m1,int m2)
	{
		this.m1=m1;
	    this.m2=m2;
	}
	public void display()
	{
		System.out.println("Additon of m1 and m2 is :" + (m1+m2));
		
	}
}
public class InstanceVariable {

	public static void main(String[] args) {
	      X x=new X();
		x.print(12,3);
		x.display();
	}

}