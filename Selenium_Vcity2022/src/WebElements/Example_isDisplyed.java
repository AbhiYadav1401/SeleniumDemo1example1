package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_isDisplyed 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhijeet.yadav1401@gamil.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9040701477");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement login_button = driver.findElement(By.xpath("//button[@name='login']"));
		boolean button = login_button.isDisplayed();
		System.out.println("Login button is Displyed  : "+button);
		login_button.click();
		driver.quit();
	}
}
