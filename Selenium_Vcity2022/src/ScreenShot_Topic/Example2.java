package ScreenShot_Topic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example2
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		String rs = RandomString.make();
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File destination = new File("C:\\Velocity\\ScreenShot\\abc"+rs+".jpg");
		FileHandler.copy(src, destination);
		driver.close();
		
	}
}