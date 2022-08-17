package com.cg.String;

import java.util.StringTokenizer;

public class StringExample6
{

	public static void main(String[] args) 
	{
		StringTokenizer st=new StringTokenizer("Lets try this");
		//System.out.println(st.nextToken()); 
		//System.out.println(st.nextToken());
		//System.out.println(st.nextToken());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}





