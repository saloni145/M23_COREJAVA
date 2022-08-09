package com.cg.Operator;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a=5,b=2	;
		//Bitwise Operator (&,|,^,>>,<<)
	     int Result = a&b;
	     int Result1 = a|b;
	     int Result2 = a^b;
	     int Result3 = a<<b; //a*2^b (Formula)
	     int Result4 = a>>b; //a\2^b (Formula)
	     
		System.out.println(Result);
		System.out.println(Result1);
		System.out.println(Result2);
		System.out.println(Result3);
		System.out.println(Result4);
 
	}

}