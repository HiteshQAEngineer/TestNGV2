package test.ng.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Example2 
{
	@BeforeSuite
	public void m1()
	{
		System.out.println("Running method m1");
	}
	
	@BeforeClass
	public void m2()
	{
		System.out.println("Running method m2");
	}
	
	@BeforeMethod
	public void m3()
	{
		System.out.println("Running method m3");
	}
	
	@Test
	public void m4()
	{
		System.out.println("Running method m4");
	}

	@AfterMethod
	public void m5()
	{
		System.out.println("Running method m5");
	}
	
	@AfterClass
	public void m6()
	{
		System.out.println("Running method m6");
	}
	
	@AfterSuite
	public void m7()
	{
		System.out.println("Running method m7");
	}
	
	

}
