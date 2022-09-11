package TestNG;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword5_dependsOnMethod
{
	@Test
	public void login()
	{
		Reporter.log("Running Login ", true);
		Assert.fail();
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		Reporter.log("Running log out", true);
	}
}
