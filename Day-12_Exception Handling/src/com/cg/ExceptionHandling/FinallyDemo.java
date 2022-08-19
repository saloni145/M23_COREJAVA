package com.cg.ExceptionHandling;

public class FinallyDemo {
	 public static void print(int[] arr)
	    {
	        System.out.println(arr[3]);
	        System.out.println("Fourth element successfully displayed!");
	    }

	public static void main(String[] args) 
	{
		 System.out.println("First line");
	        System.out.println("Second line");
	        int[] myIntArray = new int[]{1, 2, 3};
	        try 
	        {
	          print(myIntArray);
	        
	        }
	        catch(Exception e)
	        {
	        	System.out.println("Exception Handled " +e);
	        }
	        /*finally
	        {   
	        	//Finally Block will not Executed When it Contain Exception
	        	@SuppressWarnings("unused")
				int c=13/0;
	        	System.out.println("Finally Block Is ALways Executed");
	        }*/
	        
	        System.out.println("Third line");
		
	}

}
