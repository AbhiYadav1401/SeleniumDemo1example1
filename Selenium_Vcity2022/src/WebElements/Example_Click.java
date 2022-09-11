package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Click 
{
	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhijeet.yadav1401@gamil.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9040701477");
		
		WebElement login_button = driver.findElement(By.xpath("//button[@name='login']"));
		login_button.click();
		
		driver.quit();
	}
}
