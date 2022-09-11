package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//input[@data-testid=\"royal_email\"]")).sendKeys("aasdfghjkledrfg");
		
		driver.get("https://www.facebook.com/");
		
		//enter User name
		//driver.findElement(By.xpath("//input[@name ='email']")).sendKeys("abhijeet");
		//enter password
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("9014664541212");
		//click
		driver.findElement(By.xpath("")).click();
		Thread.sleep(4000);
		// click on cerat new account
		//a[text() ='Create New Account']
		//Example 1 by using contains x path
		//a[contains(text(),'password?')]
		
		driver.quit();

	}
}
