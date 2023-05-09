package test.ng.keywords3;

import org.testng.annotations.Test;

public class Disabled 
{
	@Test
	public void test1()
	{
		System.out.println("execution of test1");
	}
	
	@Test(enabled = false)
	public void test2()
	{
		System.out.println("Execution of tets2");
	}
	
	
	
	
	
	
	
	

}
