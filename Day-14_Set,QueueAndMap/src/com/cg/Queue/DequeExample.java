package com.cg.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Object> d=new ArrayDeque<Object>();
		d.add(11);
		
		//adding the elements on front and rear(back) end
		d.addFirst(13);
		d.addLast(7);
		d.add("Saloni");
		d.add("Shoni");
	    System.out.println(d);
	    
		//removing the elements from front and rear end
		d.removeFirst();
		d.removeLast();
		System.out.println(d);
		
      }
	
}
