package HandlingOfMultipleElements_Links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_printSizeOfAllLinksFromFacebookWebPage {

	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			List<WebElement> all_links_list = driver.findElements(By.xpath("//a"));
			System.out.println("all_Links List:"+all_links_list.size());
			
			for(WebElement links :all_links_list)
			{
				System.out.println(links.getText());
			}
	}

}
