package com.cg.Operator;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        //Arithmetic Operator (+,-,*,/,%)
        int Result= a*b;
        int Result1=a+b;
        System.out.println(Result);
        System.out.println(Result1);
        sc.close();
	}

}