package FrameWork;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class example2_With_DDF
{
	//C:\Velocity\Xcel_Sheet
	public static void main(String[] args) 
	{
		//FileInputStream file = new FileInputStream("//C:\\Velocity\\Xcel_Sheet");
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
}
