package Handel_Chek_list_box;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class example1_selectOptionfromSingle_SelectableListBox 
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@rel=\"async\"]")).click();;
		
		//step1
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		//step2
		Select s = new Select(day);
	
		//step3
		//s.selectByIndex(11);
		//s.selectByValue("31");
		s.selectByVisibleText("0");
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//local memory 
		
		File dest = new File("C:\\Velocity\\ScreenShot\\abc.jpg");
		System.out.println(src);
		FileHandler.copy(src, dest);
		
		System.out.println("end");
		driver.close();
	}
}
