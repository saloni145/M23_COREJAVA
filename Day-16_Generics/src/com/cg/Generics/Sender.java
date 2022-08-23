package com.cg.Generics;
//Generic Class
public class Sender <T>
{
	private T message;
     //Getter Method
	public T getMessage() {
		return message;
	}
     //Setter Method
	public void setMessage(T message) {
		this.message = message;
	}
	
	public void sendMessage()
	{
		System.out.println("Message Type: "+getMessage().getClass());
		System.out.println("Contents are: "+getMessage());
	}
 
}