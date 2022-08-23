package com.cg.Generics;
//1.Email 2.Sender 3.Executor/Receiver
public class Email 
{
	private String From;
	private String To;
	private String Subject;
	private String Body;
	//getter method
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getBody() {
		return Body;
	}
	public void setBody(String body) {
		Body = body;
	}

}	
