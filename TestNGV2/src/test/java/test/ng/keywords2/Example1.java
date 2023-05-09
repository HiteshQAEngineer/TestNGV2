package test.ng.keywords2;

import org.testng.annotations.Test;

public class Example1 
{
	@Test(priority = 0)
	public void test1()
	{
		System.out.println("Running test 1");
	}
	
	@Test(priority = 1, enabled = true, dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("Running test 2");
	}
	
	
	
	
}
