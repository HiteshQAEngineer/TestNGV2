package test.ng.keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount
{
	
	@Test(invocationCount = 4)
	public void login()
	{
		Reporter.log("Login Functionality", true);
	}
	
	
	
	
	

}
