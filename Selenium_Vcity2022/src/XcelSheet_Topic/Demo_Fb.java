package XcelSheet_Topic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo_Fb 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		FileInputStream file = new FileInputStream("C:\\Velocity\\Xcel_Sheet\\Facbook_Demo.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String gmail_Id = sh.getRow(1).getCell(0).getStringCellValue();
		String pswd = sh.getRow(1).getCell(1).getStringCellValue();
		
		WebElement username = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		username.sendKeys(gmail_Id);
		
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys(pswd);
		Thread.sleep(4);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Velocity\\ScreenShot\\AAA.jpg");
		FileHandler.copy(src, dest);
		//driver.close();
		

	}
}
