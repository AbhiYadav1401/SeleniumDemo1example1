package Page_Object_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		KiteLogin1Page login1 = new KiteLogin1Page(driver);
		login1.enterUserId();
		login1.enterPassword();
		Thread.sleep(4000);
		login1.clickOnLogin();
	
		KiteLogin2Page login2 = new KiteLogin2Page(driver);
		login2.enterPin();
		login2.clickOncontButton();
		
		KiteHomePage homepage = new KiteHomePage(driver); 
		homepage.verifyUserId();
		Thread.sleep(2000);
		driver.close();
	}

}
