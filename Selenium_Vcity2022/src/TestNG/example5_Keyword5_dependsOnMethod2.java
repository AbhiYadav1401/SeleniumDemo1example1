package TestNG;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example5_Keyword5_dependsOnMethod2
{
	@Test
	public void login1()
	{
		Reporter.log("running login1", true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods={"login1","login2"})
	public void login2()
	{
		Reporter.log("runing login2", true);
		Assert.fail();
	}
	
}
