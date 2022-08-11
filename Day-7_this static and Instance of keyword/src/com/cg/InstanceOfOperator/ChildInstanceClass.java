package com.cg.InstanceOfOperator;
class A
{
	
}
public class ChildInstanceClass extends A {

	public static void main(String[] args) {
		ChildInstanceClass c=new ChildInstanceClass();
		// c is the object of parent class"A" because "ChildInstance" class accessing the "A" class
		System.out.println(c instanceof A);
		//instance of is nothing but the object
		System.out.println(c instanceof ChildInstanceClass );
	}

}