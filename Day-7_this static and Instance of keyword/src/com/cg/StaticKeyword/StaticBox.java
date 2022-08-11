package com.cg.StaticKeyword;

public class StaticBox
{
	double width;
	double height;
	static int count;
	//Parameterized Constructor
	public StaticBox(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	public StaticBox()
	{
		super();
		int cnt=0;
		cnt++;
		System.out.println("Count is: "+cnt);
		count++;
	}

	public static void main(String[] args) {
		//StaticBox s=new StaticBox (20,6);
		StaticBox s=new StaticBox ();
		s.width=20;
		s.height=6;
		System.out.println(s.width);

	}

}
