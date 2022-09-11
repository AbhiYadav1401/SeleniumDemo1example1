package POM_Naming_Convenstion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		KiteLoginPage1 login1 = new KiteLoginPage1(driver);
		login1.inpKiteLoginPage1UserID();
		login1.inpKiteLoginPage1PassWord();
		login1.clickKiteLoginPageLoginButton();
		
		KiteLoginPage2 login2 = new KiteLoginPage2(driver);
		login2.inpKiteLoginPage2Pin();
		login2.clickKiteLoginPage2contButton();
		
		KiteHomePage home = new KiteHomePage(driver);
		home.verifyKiteHomePageUserId();
		Thread.sleep(3000);
		driver.close();
	} 
}
