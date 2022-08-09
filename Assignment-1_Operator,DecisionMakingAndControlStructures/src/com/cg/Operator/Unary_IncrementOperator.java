package com.cg.Operator;

public class Unary_IncrementOperator {

	public static void main(String[] args) {
		//PreIncrement= ++a 
		//PostIncrement= a++ 
       int a=5,b=3;
       int X=a++;
       int Y=++b;
       int Z=a+X;
       System.out.println(Y);
       System.out.println(Z);
	}

}
