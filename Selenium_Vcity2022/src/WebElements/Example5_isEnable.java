package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_isEnable 
{
	 public static  void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean login_button = driver.findElement(By.xpath("//button[@name=\"login\"]")).isEnabled();
		
		System.out.println(login_button);
		
		if(login_button== true)
		{
			System.out.println("Login button is enable");
		}
		else
		{
			System.out.println("login button in not enable");
		}
		
	}
}
