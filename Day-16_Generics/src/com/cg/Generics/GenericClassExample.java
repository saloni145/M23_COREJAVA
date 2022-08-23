package com.cg.Generics;
//Generic Class
public class GenericClassExample<T>{
	//T is a type
	T num;
	//method
	public void display()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		//Instead Of Collections I Have Used Generic Class Name And Generic Concept
		GenericClassExample<Double>obj=new GenericClassExample<Double>();//Generic advantage
		obj.num=15.0;
		obj.display();

	}

}
