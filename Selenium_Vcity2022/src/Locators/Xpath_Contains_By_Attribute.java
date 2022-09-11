package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Contains_By_Attribute 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/");

		
		//enter UN
		driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("abc");
		
	
		//enter pwd
		driver.findElement(By.xpath("//input[contains(@class,'_9npi')]")).sendKeys("xyz");
		
		
		//click on login btn
		driver.findElement(By.xpath("//button[contains(@class,'6lth _4jy6')]")).click();
		
	}
}
