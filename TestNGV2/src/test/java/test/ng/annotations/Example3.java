package test.ng.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example3
{
	//A class with single test case
	@BeforeSuite
	public void m1()
	{
		System.out.println("Running method m1");
	}
	
	@BeforeTest
	public void m2()
	{
		System.out.println("Running method m2");
	}
	
	@BeforeClass
	public void m3()
	{
		System.out.println("Running method m3");
	}
	
	@BeforeMethod
	public void m4()
	{
		System.out.println("Running method m4");
	}
	
	@Test
	public void m5()
	{
		System.out.println("Running method m5");
	}

	@AfterMethod
	public void m6()
	{
		System.out.println("Running method m6");
	}
	
	
	@AfterClass
	public void m7()
	{
		System.out.println("Running method m7");
	}
	
	@AfterTest
	public void m8()
	{
		System.out.println("running method m8");
	}
	
	@AfterSuite
	public void m9()
	{
		System.out.println("Running method m9");
	}
	
	
	
	

}
