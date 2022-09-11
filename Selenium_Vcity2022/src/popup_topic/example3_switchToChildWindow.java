
 package popup_topic;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_switchToChildWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click on can't with face-book link 
		driver.findElement(By.xpath("//span[contains(text(),'Continue with Facebook')]")).click();
		
		//get Child window id 
		Set<String> windows_all_Id = driver.getWindowHandles();
		//main page id , child page id
		ArrayList<String> al = new ArrayList(windows_all_Id);
		
		//main pageID[0] ,child pageID[1];
					String childwindowID = al.get(1);
		//switch to child window
		driver.switchTo().window(childwindowID);

		//enter email id 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhijeetyadav");
	
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.close();
		
	
	}

}
