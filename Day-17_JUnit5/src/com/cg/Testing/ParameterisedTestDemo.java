package com.cg.Testing;


import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterisedTestDemo
{
	@ParameterizedTest
	@ValueSource(strings= {"Neha","Monika"})
	void print(String word)
	{
		assertNotNull(word);
	}

}
