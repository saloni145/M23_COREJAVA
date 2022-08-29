package com.cg.Testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger 
{
	//It is used to signal that the annotated method should be executed after all 
	//tests in the current test class.
	@AfterAll
	default void AfterAllTestMethod()
	{
		System.out.println("AfterAll Method");
	}
	
	@AfterEach
	default void AfterEachTest()
	{
		System.out.println("After Each test");
	}
    //It is used to signal that the annotated method should be executed 
	//before all tests in the current test class
	@BeforeAll
	default void beforeAllTests()
	{
		System.out.println("Before all test");
	}
	
	@BeforeEach
	default void beforeEachTests()
	{
		System.out.println("Before Each test");
	}
	
	
}

