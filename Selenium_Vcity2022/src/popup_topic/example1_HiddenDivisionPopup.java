package popup_topic;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//enter UserName
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abhijeetyadav");
	
		//enter password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
	
		Thread.sleep(4000);
		
		//click on login button //***Path***
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
			
		driver.close();
	}

}
