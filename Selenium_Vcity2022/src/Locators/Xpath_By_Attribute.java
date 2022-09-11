package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//enter User name
	driver.findElement(By.xpath("//input[@name ='email']")).sendKeys("abhijeet");
	//enter password
	driver.findElement(By.xpath("//input[@name= \"pass\"]")).sendKeys("9014664541212");
	//click
	driver.findElement(By.xpath("")).click();
	Thread.sleep(4000);

	driver.quit();
			
}
}
