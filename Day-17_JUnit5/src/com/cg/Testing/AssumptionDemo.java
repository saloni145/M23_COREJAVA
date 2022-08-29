package com.cg.Testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo 
{
	@Test
	void divison()
	{
		System.setProperty("Saloni","Shoni");
		//if assumption is true then printing statement will print otherwise not 
		Assumptions.assumeTrue("Shoni".equals(System.getProperty("Saloni")));
	    System.out.println("Assumption is True");
	}

}
