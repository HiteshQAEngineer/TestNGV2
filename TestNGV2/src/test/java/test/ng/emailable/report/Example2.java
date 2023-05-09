package test.ng.emailable.report;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example2 
{
	
	//Would like to have a msg in the console + emailable report
	
	
	@Test
	public void logoutFunctionality()
	{
		Reporter.log("Verifying the Logout functionality", true);
		
	}

}
