package com.capgemini.introduction;

import java.util.Scanner;

public class FloatInput{
	
     public static void main(String[] args) {
    
    /*
     * initialized two float variables n1 and n2.
     * declared n3 which will contain the output
     * of n1 * n2.
     
   
	float n1 = 10.89f;
    float n2 = 7.43f;
    float n3;
     
    // multiplied n1 and n2 and stored it in n3
    n3 = n1*n2;
     
    // printed the value of n3
    System.out.println("The result of n1 x n2 is: " +n3);*/
	
    	 
    	 
    	 
	 String str1 = "10.12345";        
     Scanner scanner = new Scanner(str1);   
     System.out.println("Result: "+scanner.hasNextFloat());  
     System.out.println("Scan String: "+scanner.next());           
     scanner.close();  
}
 
		 
	}

