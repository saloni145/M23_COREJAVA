package com.cg.LambdaExpression;

//functional interface
@FunctionalInterface
interface D
{
	String display(String str);//abstract method
}
public class FunctionalInterface_OneParameter {

	public static void main(String[] args) {
		//Lambda Expression with return statement
		D obj=(String str)->
		{
			return str;
			
		};
		System.out.println(obj.display("Welcome to Lamda Expression Concept"));
	}

}
