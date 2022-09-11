package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass2_assertequals
{
	@Test
	public void TC1()
	{
		String actResult ="HI";
		String expResult ="HI";
		Assert.assertNotEquals(actResult, expResult ,"Failed - both result are same");
	}
}
