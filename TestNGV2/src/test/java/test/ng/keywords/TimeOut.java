package test.ng.keywords;

import static org.testng.Assert.fail;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TimeOut 
{
	
	@Test(priority = 1)
	public void tets1()
	{
		System.out.println("Execution of test1");
	}
	
	@Test(timeOut = 2000, priority = 0)
	public void test2() throws InterruptedException
	{
		System.out.println("Execution of test2");
		Thread.sleep(5000);
	}
	
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("Test 3 Depedent test");
		//Assert.fail();
	}

}
