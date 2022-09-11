package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword4_TimeOut
{
	@Test(timeOut=5000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(6000);
		Reporter.log("Running Tc1", true);
	}
}
