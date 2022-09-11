package HandlingOfMultipleElements_Links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_PrintAllLinksFromFaceBookWebPage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> links_list = driver.findElements(By.xpath("//a"));
		System.out.println("Links List:"+links_list.size());
		
		for(WebElement links :links_list)
		{
			System.out.println(links.getText());
		}
	}

}
