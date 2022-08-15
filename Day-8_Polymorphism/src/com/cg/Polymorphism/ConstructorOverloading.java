package com.cg.Polymorphism;

//program on constructor overloading
class Triber
{
	int speed;
	String engine;
	//zero-parameter(Default)
	Triber()
	{
		System.out.println("Renault-kiger");
	}
	
	//two parameter(Parameterized)
	Triber(int speed,String engine)
	{
		this.speed=speed;
		this.engine=engine; 
		System.out.println("Speed is: "+speed+"km/hr" +" and the engine is on:"+engine );
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Triber t=new Triber();
		@SuppressWarnings("unused")
		Triber t1=new Triber(45,"Disel");


	}

}
