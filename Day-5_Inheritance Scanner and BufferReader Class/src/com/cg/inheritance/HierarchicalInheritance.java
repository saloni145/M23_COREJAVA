package com.cg.inheritance;
class AndroidVersion
{
	void display()
	{
		System.out.println("Android-Version");
	}
}
class Kitkat extends AndroidVersion
{
	void print()
	{
		System.out.println("Kitkat");
	}
}
class Pie extends AndroidVersion
{
	void print()
	{
		System.out.println("Pie");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Kitkat k=new Kitkat();
		Pie p=new Pie();
		k.display();
		k.print();
		p.print();
	}

}
