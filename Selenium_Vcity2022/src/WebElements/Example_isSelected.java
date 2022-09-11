package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_isSelected 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement  button =driver.findElement(By.xpath("//div[@class=\"_6ltg\"][2]"));
		button.click();
		String button_fb = button.getText();
		System.out.println(button_fb);
		
		WebElement rButtonfemale = driver.findElement(By.xpath("//label[@class=\"_58mt\"][1]"));  //label[contains(text(),'Female')]
		boolean result1 = rButtonfemale.isSelected();
		
		
		if(result1==true)
		{
			System.out.println("if the radio button is selected :"+result1);
		}
		else
		{
			System.out.println("if radio button is not selected :"+result1);
		}
		
		rButtonfemale.click();
		System.out.println("click");
		boolean result2 =  rButtonfemale.isSelected();
		
		if(result2 == true)
		{
			System.out.println("if it is selected :");
		}
		else
		{
			System.out.println("if it is not selected:");
		}
		
	}
	
}


