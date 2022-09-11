package Example1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//how to nevagate 
	
		/*
		driver.get("www.facebook.com");
		Thread.sleep(4000);
		driver.get("www.google.com");
			*/	
				driver.navigate().to("https://www.facebook.com/");
				Thread.sleep(4000);
				driver.navigate().to("https://www.google.com/");
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
				Thread.sleep(2000);
				driver.navigate().refresh();
	}

}
