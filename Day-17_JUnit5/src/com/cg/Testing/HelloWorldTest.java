package com.cg.Testing;

import org.junit.jupiter.api.Test;

public class HelloWorldTest implements TestLifeCycleLogger
{
	@Test
	void print()
	{
		System.out.println("Hello World");
	}

}
