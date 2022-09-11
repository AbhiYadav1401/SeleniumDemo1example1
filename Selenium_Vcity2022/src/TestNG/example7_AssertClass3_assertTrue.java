package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class example7_AssertClass3_assertTrue 
{
	@Test
	public void TC1()
	{
		boolean actResult = false;
		Assert.assertTrue(actResult);
	}
}
