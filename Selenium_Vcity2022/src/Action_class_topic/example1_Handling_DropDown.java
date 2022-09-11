package Action_class_topic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_Handling_DropDown 
{
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//click on close button  
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//Step1
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		//Step2
		Actions act = new Actions(driver);
		//step3
		act.moveToElement(login).perform();
		Thread.sleep(2000);
		
		// click on orders+ option from drop down element //div[text()='Flipkart Plus Zone']
		//driver.findElement(By.xpath("//div[text()='Orders']")).click();
		driver.findElement(By.xpath("//div[text()='Flipkart Plus Zone']")).click();
	}
}
