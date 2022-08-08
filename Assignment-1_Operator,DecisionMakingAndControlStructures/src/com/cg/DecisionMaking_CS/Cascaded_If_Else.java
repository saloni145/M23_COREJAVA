package com.cg.DecisionMaking_CS;

public class Cascaded_If_Else {

	public static void main(String[] args) {
		//(Cascaded If_Else) is also known as (If..else..If..else)
       int a=5 ,b=3, c=9;
       if (a>b && a>c)
		{
			System.out.println(a);
		}
		else if (b>a && b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
    	   
	}

}
