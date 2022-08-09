package com.cg.Recursion;

public class SunOfDigits {

	static int findSum(int number)  
	{  
	//returns sum      
	//if number is not equal to 0 then execute code after colon (:), else print 0    
	//the method findSum() is recursively called  
	return number == 0 ? 0 : number % 10 +findSum(number/10) ;  
	}  
	public static void main(String[] args) {
		
		int number = 12345;  
		//calling the user-defined method and prints the result   
		System.out.println("The sum of digits: "+findSum(number));  
		
	}

}