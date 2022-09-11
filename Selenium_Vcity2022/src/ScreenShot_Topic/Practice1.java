package ScreenShot_Topic;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Practice1
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		
		File des = new File("C:\\Velocity\\ScreenShot\\xyz.jpg");
		
		//FileHandler.copy(src, destination);
		
		driver.close();
		
		
	}
}
