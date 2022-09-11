package FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_WithOutDDF 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//enter userId
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("KXW990");
		//enterPassword
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Safwan1802@");
		//ClickonButton
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("180216");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//get user ID
		String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expUserID = "KWX990";
		if(actUserID.equals(expUserID))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("faile");
		}
		Thread.sleep(3000);
		driver.close();
	}
}
