package Action_class_topic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example5_doubleClick {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//click on close button  
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	
		Actions act = new Actions(driver);
		//act.moveToElement(double_click).perform();
		//act.doubleClick().perform();
		act.moveToElement(button).doubleClick().build().perform();
		//act.doubleClick(button).perform();
	}

}
