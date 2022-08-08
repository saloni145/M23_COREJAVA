package com.cg.ScanBuff;

import java.util.Scanner;
//Example on Scanner class
public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		//String str=s.nextLine();
		int a=s.nextInt();
		System.out.println(a);
		s.close();
	}

}
