package com.cg.Looping_Iteration;

public class PrintPattern {

	public static void main(String[] args) {
		int i,j,row=5;
		//i=rows,j=columns,Row=number of rows you want
		for(i=0;i<row;i++) //for outer loop for rows
		{
			for(j=0;j<=i;j++) //for inner loop for Columns
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

	

}
