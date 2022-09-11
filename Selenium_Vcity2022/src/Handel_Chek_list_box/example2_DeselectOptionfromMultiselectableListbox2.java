package Handel_Chek_list_box;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example2_DeselectOptionfromMultiselectableListbox2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("xml file cha foldermadhe open karun url dyacha ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement selectCountry =driver.findElement(By.xpath("//select[@id='1234']"));
		//step2
		Select s = new Select(selectCountry);
		//setp3
		s.deselectByIndex(1);
		s.deselectByIndex(2);
		s.deselectByIndex(3);
		Thread.sleep(2000);
		
		//de-select option
		s.deselectAll();
	}
}
