package com.cg.ExceptionHandling;

import java.io.IOException;

public class ThrowsKeyword 
{

	//throws is used to declare an exception
		static void print(int num)throws IOException, ClassNotFoundException
		{
			if(num==1)
				throw new IOException("Exception caught");
			else
				throw new ClassNotFoundException("Exception handled");
		}

		public static void main(String[] args) throws IOException {
			try
			{
				print(2);
				
			}
			catch(ClassNotFoundException e)
			{
				System.out.println(e);
			}

		}

}