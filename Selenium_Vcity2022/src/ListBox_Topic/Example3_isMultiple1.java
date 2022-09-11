package ListBox_Topic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3_isMultiple1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Step1
		WebElement button = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		button.click();
		//step1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(month);
		
		boolean result =s.isMultiple();
		System.out.println(result);
		if(result == true )
		{
			System.out.println("List box is of multi selectable");
		}
		else
		{
			System.out.println("list box is of single selectable");
		}
		

	}

}
