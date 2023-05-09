package test.ng.annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1 
{
	//once in a lifetime code needs to be declared with @BeforeClass annotation
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Open Browser", true);
	}
	
	//Pre-requisites before actual test cases should be declared with @BeoforeMethod annotation
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("Login to App", true);
		
	}
	
	
	//Actual test case with @Test annotation
	@Test
	public void verifyLogoText()
	{
		Reporter.log("Verify logo text", true);
	}
	
	//actions to perform after actual test case should be added here
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("Logout from the application", true);
		
	}
	
	//one time action done at the end of test should be added here
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close Browser", true);
	}
	
	
	
	

}
