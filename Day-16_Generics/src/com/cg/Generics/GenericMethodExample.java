package com.cg.Generics;

public class GenericMethodExample 
{
//Generic Method: We can pass any type of Arguments
//E is a Element
		public static <E>void printArray(E[] elem)
		{
			for(E itr:elem)
			{
				//to check class name
				System.out.println(itr.getClass().getName());
				System.out.println(itr);
			}
			
			System.out.println();
			
		}

public static void main(String[] args) 
{
	
	Integer arr[]= {11,22,33};
	Character ch[]= {'P','Q','R'};
	
	System.out.println("Integer Array: ");
	printArray(arr);
	
	System.out.println("Character Array: ");
	printArray(ch);
}

}
