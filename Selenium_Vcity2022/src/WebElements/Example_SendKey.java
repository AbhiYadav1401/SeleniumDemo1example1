package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_SendKey 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username =driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Abhijeet yadav");
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("Yadav ABHIJEET");
		System.out.println(driver.getTitle());
		
		
	}
}
