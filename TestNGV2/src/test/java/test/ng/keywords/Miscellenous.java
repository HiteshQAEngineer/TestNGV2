package test.ng.keywords;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Miscellenous 
{
	@Test
	public void test1()
	{
		System.out.println("Running test case 1");
		//Assert.fail();
	}
	
	@Test(timeOut = 3000)
	public void test2() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Running test case 2");
	}
	
	//Multiple test cases can be made dependent I.e., Test3 depends on Test1, Test2
	@Test(dependsOnMethods = {"test1", "test2"}, enabled = false)
	public void test3()
	{
		System.out.println("Running test case 3");
	}
	
	
	
	

}
