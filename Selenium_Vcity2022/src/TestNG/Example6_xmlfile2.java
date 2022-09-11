package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example6_xmlfile2 
{
	@Test
	public void TC3()
	{
		Reporter.log("running TC1", true);
	}
	
	@Test
	public void TC4()
	{
		Reporter.log("runing TC2", true);
	}

}
