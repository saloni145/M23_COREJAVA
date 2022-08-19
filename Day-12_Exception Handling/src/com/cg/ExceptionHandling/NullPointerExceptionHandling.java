package com.cg.ExceptionHandling;

public class NullPointerExceptionHandling {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str=null;
		try
		{
			str.equals("java");
		}
        catch(Exception e)
		{
        	//allocated a new value to str is "java"
        	str=new String("java");
        	System.out.println(str.equals("java"));
		}
	}

}
