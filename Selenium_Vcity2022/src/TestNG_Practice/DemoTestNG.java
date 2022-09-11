package TestNG_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class  DemoTestNG 
{
	String helMent ="VEGA Edge Motorbike Helmet";
	WebDriver driver ;
	private Object Repoter;
	@Test(priority=1)
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test(priority=2,enabled = false)
	public void hiddenPopup() throws InterruptedException
	{
				driver.switchTo().alert();
	        	//enter UserName
				driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abhijeet.yadav1401@gmail.com");
				//enter password
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abhijeet1401");
				Thread.sleep(4000);
				//click on login button //***Path***//
				driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
			
	}
	@Test (priority =3 ,enabled = true)
	public void verifyPage()
	{
		boolean img = driver.findElement(By.xpath("//img[@alt='Flipkart']")).isDisplayed();
		//System.out.println("enter in flipkart page "+img);
		Reporter.log("Enter in flipkart page : "+img, true);
	}
	@Test(priority = 5)
	public void pageLinks()
	{
	List<WebElement> linksList =	driver.findElements(By.xpath("//a"));
	int linksize =linksList.size();
	
	for(WebElement link_Displayed :linksList)
	{
		Reporter.log("Link shows :" +link_Displayed.getText());
	}
	Reporter.log("WebPage Links SIZE :"+linksize, true );
	
	}
	@Test(priority = 4)
	public void searchItems() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("VEGA Edge Motorbike Helmet  (Black)");
		WebElement search = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		search.click();
		Thread.sleep(2000);
		WebElement helmentLink = driver.findElement(By.xpath("//a[@title='VEGA Edge Motorbike Helmet']  "));
		if(helmentLink.equals(helMent))
		{
			helmentLink.click();
			WebElement rs = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
			String Rs = rs.getText();
			Reporter.log(Rs);
		}
		else
		{
			System.out.println("helment is not found ");
		}
	}
	@Test(enabled = true)
	public void closer()
	{
		driver.quit();
	}
}
