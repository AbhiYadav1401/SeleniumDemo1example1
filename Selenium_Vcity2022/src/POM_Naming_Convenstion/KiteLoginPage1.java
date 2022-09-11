package POM_Naming_Convenstion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1
{
	@FindBy(xpath = "//input[@type='text']")private WebElement UserID;
	@FindBy(xpath = "//input[@type='password']")private WebElement PassWord;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
	
	public  KiteLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpKiteLoginPage1UserID()
	{
		UserID.sendKeys("KXW990");
	}
	public void inpKiteLoginPage1PassWord()
	{
		PassWord.sendKeys("Safwan1802@");
	}
	public void clickKiteLoginPageLoginButton()
	{
		LoginButton.click();
	}
}
