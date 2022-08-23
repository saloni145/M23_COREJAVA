package com.cg.Generics;

public class Executor {

	public static void main(String[] args) 
	{
		//create a sender to send a string message
		Sender<String>obj=new Sender<>();
		obj.setMessage("Generic Class Demo");
		obj.sendMessage();
		
		System.out.println();
		
		//create an mail object to be send using sender
		Email em=new Email();
		em.setFrom("salonip705@gmail.com");
		em.setTo("skumbhalkar@tnsif.org");
		em.setSubject("Java Full Stack");
		em.setBody("About Training and Placement");
		
		//create a sender to send this mail
		Sender<Email>obj1=new Sender<Email>();
		obj1.setMessage(em);
		
		obj1.sendMessage();

	}

}
