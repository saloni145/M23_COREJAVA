package com.cg.List;

import java.util.Stack;

public class StackDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack obj=new Stack();
		obj.add(0, "Shoni");
		obj.add(0, 'z');
		obj.add(0, 15.5f);
		System.out.println(obj);
		//to insert
		obj.push(34);
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);
		

	}

}
