package POM_With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//19/8/2022
public class KiteLoginTest1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifactions");

		System.setProperty("webdriver.chrome.driver","C:\\Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		FileInputStream file = new FileInputStream("C:\\Velocity\\Xcel_Sheet\\KiteApplication.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	
		KiteLoginPage1 login1 = new KiteLoginPage1(driver);
		
		login1.inpKiteLoginPage1UserID(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpKiteLoginPage1PassWord(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickKiteLoginPage1LoginButton();
	
		KiteLoginPage2 login2 = new KiteLoginPage2(driver);
		login2.inpKiteLoginPage2Pin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.clickKiteLoginPage2_contButton();
		
		KiteHomePage home =new KiteHomePage(driver);
		home.verifyKiteHomePageUserId(sh.getRow(0).getCell(3).getStringCellValue());
		
		Thread.sleep(3000);
		driver.close();
	}
}
