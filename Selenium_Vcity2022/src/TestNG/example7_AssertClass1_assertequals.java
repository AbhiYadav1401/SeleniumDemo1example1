package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass1_assertequals 
{
	@Test
	public void TC1()
	{
		String actResult ="HI";
		String expResult ="Hello";
		
		//Assert.assertEquals(actResult, actResult);
		Assert.assertEquals(actResult, actResult,"Failed both  result are diff");
	}
}
