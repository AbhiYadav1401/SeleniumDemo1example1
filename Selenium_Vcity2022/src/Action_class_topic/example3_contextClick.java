package Action_class_topic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example3_contextClick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//click on close button  
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//step1 cart element 
		WebElement cart_ele = driver.findElement(By.xpath("//span[text()='Cart']"));
		System.out.println(cart_ele.getText());
		Actions act = new Actions(driver);
		//act.moveToElement(cart_ele).perform();
		//act.contextClick().perform();--mouse left button clcik action //dot no 
		//contextClick--->web element target --->mouse right button action
		act.contextClick(cart_ele).perform();
		
	}

}
