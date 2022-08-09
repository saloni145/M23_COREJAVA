package com.cg.Operator;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
      //Logical Operator (&&,||,!)
        boolean Result=(a>b && b<4);
        boolean Result1=(a>b || b<4);
        boolean Result2= !(a>b);
        
        System.out.println(Result);
        System.out.println(Result1);
        System.out.println(Result2);
        sc.close();

	}

}