package ListBox_Topic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1_SelectOptionfromMultiSelectableListBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Velocity/HTML/ListBox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Step1
		WebElement selectCountry =  driver.findElement(By.xpath("// select[@multiple='true']"));
		//step2
		Select s = new Select(selectCountry);
		
		//Step3
		//s.selectByVisibleText("Srk");
		//s.selectByVisibleText("Pak");
		//s.selectByIndex(3); // int index
		//s.selectByValue("1"); // String value
		Thread.sleep(4000);
		driver.close();
		
	}
}
