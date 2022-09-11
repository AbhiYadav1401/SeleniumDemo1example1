package iFrame_Topic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_AlertPopup1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		//enter customer id 
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("11");
		

		//click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	
		//getText from alert pop up
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		//click on cancel button from alert popup 
		//driver.switchTo().alert().dismiss();
		
		//click on Ok button from1alert pop up
		driver.switchTo().alert().accept();
		//click on ok button from 2nd alert pop up
		driver.switchTo().alert().accept();
		
		
	}

}
