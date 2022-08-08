package com.cg.DecisionMaking_CS;

public class Nested_If {

	public static void main(String[] args) {
		//Nested If Means Inside If their is another If
		int age=15,weight=110;
		if (age>=12)
		{
			if(weight>=50)
			{
				if(weight<=110)
				{
					System.out.println("Eligible To Denote The Blood");
				}
				else 
				{
					System.out.println("Not Eligible To Denote The Blood ");
				}
			}
				else 
				{
					System.out.println("Age Is More");
				}
		}
			else 
			{
				System.out.println("Age Is More");
			}
			
		}

	}


