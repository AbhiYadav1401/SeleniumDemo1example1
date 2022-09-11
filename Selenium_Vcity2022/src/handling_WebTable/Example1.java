package handling_WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> row_no =  driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
		System.out.println("Size of the row is : "+row_no.size());
		List<WebElement> column_no = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul/li"));
		System.out.println("Column size of :"+column_no);
		
		for(int i=0; i<row_no.size();i++)
		{
			System.out.println(row_no.get(i).getText());
		}
		driver.quit();
	}

}
