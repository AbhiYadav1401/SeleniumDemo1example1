package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_Annotations {
			@BeforeClass
			public void openBrowser()
			{
				System.out.println("Open Browser");
			}
			@BeforeMethod
			public void loginToApp()
			{
				System.out.println("Login to application");
			}
			@Test
			public void verifyUserId1()
			{
				System.out.println("verify user ID1");
			}
			@Test
			public void verifyUserId2()
			{
				System.out.println("Verify user Id2");
			}
			@AfterMethod
			public void logOutPage()
			{
				System.out.println("Logout from application");
			}
			@AfterClass
			public void closeBrowser()
			{
				System.out.println("close browser");
			}
}
