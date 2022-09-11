package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_getText
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhijeet.yadav1401@gamil.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9040701477");
		
		WebElement login_button = driver.findElement(By.xpath("//button[@name='login']"));
		String button_login = login_button.getText();
		login_button.click();
		System.out.println("get Text of login Buttonn : "+button_login );
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'Is this your account?')]")).getText();
		
		//System.out.println("Get a Message on screen : " +text );
		
		String msg ="Is this your account?";
		if(text!= msg)
		{
			System.out.println("This is my account : " + text);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='_9ai5']")).click();
		}
		else
		{
			System.out.println("This is not my account :"+text);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_9ai5']")).click();
	}
}
