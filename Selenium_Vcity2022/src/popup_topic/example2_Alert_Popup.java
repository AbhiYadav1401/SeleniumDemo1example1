package popup_topic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_Alert_Popup {

	public static void main(String[] args)
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
	
		//switch to alert pop up
		Alert alt = driver.switchTo().alert();
		
	   //get text from alert pop up 
		String text = alt.getText();
		System.out.println(text);
	
	   //click on cancel button from alert pop up 
		alt.dismiss();
	
		//click on ok button from 1st alert 
		alt.accept();
		
		//click on ok button from 2nd alert pop up 
		alt.accept();
	}

}
