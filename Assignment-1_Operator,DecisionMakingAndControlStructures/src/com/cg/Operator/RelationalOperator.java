package com.cg.Operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          int a =sc.nextInt();
          int b =sc.nextInt();
          //Relational Operator (<,>,<=,>=,++,!=)
          boolean result= a<b;
          System.out.println(result);
          sc.close();
	}

}