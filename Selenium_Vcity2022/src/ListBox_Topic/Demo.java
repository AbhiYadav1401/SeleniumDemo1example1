package ListBox_Topic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//click on create new account
		WebElement button = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		button.click();
		//step1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//step2
		Select s = new Select(month);
		//s.selectByIndex(4);
		//s.selectByVisibleText("Jan");
		s.selectByValue("1");
		Thread.sleep(4000);
		
		driver.close();
	}
}
