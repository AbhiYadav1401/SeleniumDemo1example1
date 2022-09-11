package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_Clear 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("Abhijeet.yadav1401@gmsil.com");
		Thread.sleep(4000);
		username.clear();
		
		username.sendKeys("yadav.abhijeet1401@gmail.com");
		boolean text = username.isEnabled();
		
		String titel = driver.getTitle();
		System.out.println("Text are : "+text);
		System.out.println(titel);
		driver.close();
		
		
		
	}
}
