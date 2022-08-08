package com.cg.DecisionMaking_CS;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		//u can use any DataType like char,string, etc.
		s.close();
		switch (a)
		{
			case 1:
			
				System.out.println("Devyani");
				break;
			
			case 2:
			
				System.out.println("Vinod");
				break;
			
			case 3:
			
				System.out.println("Kasar");
				break;
				
			default :
				System.out.println("Invalid Input");
			
			
		}

	}

}
