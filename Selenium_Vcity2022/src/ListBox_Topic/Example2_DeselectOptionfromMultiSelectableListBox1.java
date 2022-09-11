package ListBox_Topic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2_DeselectOptionfromMultiSelectableListBox1 
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
		s.selectByVisibleText("Ind");
		s.selectByVisibleText("Srk");
		s.selectByVisibleText("Pak");
		s.selectByVisibleText("Aust");
		
		Thread.sleep(4000);
	
		//step3 De-select option
		//s.deselectByIndex(3);
		//s.deselectByValue("2");
		//s.deselectByValue("1");
		//s.deselectAll();
		driver.close();
	}
}
