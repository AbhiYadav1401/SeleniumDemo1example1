package HandlingOfMultipleElements_Links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//All Links find out
		List<WebElement> list_All_Links = driver.findElements(By.xpath("//a"));
		
		int size = list_All_Links.size();
		
		for(WebElement all_Links :list_All_Links)
		{
			System.out.println(all_Links.getText());
		}
		System.out.println(size);
		
	}
}
