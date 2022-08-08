package com.cg.inheritance;

//Parent Class1
class Bike
{
	protected int speed;
	void display()
	{
		System.out.println("I like to drive bike");
	}
}
//parent class for pulser125 and child class of Bike
class Pulser extends Bike
{
	protected String color;
	void print()
	{
		System.out.println("Speed is : "+speed);
	}
}
class Pulser125 extends Pulser
{
	

	void accept()
	{
		System.out.println("Color is : "+color);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Pulser125 p=new Pulser125();
		p.color="Black";
		p.speed=60;
		p.accept();
		p.print();
	}

}
