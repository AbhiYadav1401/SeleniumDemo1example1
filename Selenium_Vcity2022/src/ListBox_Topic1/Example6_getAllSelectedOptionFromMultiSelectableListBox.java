package ListBox_Topic1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example6_getAllSelectedOptionFromMultiSelectableListBox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Velocity/HTML/ListBox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Step1
		WebElement selectCountry =  driver.findElement(By.xpath("// select[@multiple='true']"));
		//step2
		Select s = new Select(selectCountry);
		s.selectByIndex(2);
		s.selectByIndex(0);
		s.selectByIndex(3);
		//step3
		List<WebElement> allselectedOption =s.getAllSelectedOptions();
		
		for(WebElement s1 :allselectedOption)
		{
			System.out.println(s1.getText());
		}
	}

}
