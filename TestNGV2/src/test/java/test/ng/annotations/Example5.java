package test.ng.annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example5
{
	//@BeforeSuite
	@BeforeTest
	public void m1()
	{
		System.out.println("Running method m1");
	}

	//test case 01
	@Test
	public void m2()
	{
		System.out.println("Running method m2 : Test Case 01");
	}

	//@AfterSuite
	@AfterTest
	public void m3()
	{
		System.out.println("Running method m3");
	}

}
