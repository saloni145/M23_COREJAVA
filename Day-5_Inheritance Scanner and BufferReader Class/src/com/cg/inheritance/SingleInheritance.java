package com.cg.inheritance;
class Parent
{
	protected int rollno;
	void print()
	{
		System.out.println("Hey Guys");
	}
}
class Child extends Parent
{
	void accept()
	{
		System.out.println("roll no is: "+rollno);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.rollno=121;
		c.accept();
		c.print();
		
	}

}
