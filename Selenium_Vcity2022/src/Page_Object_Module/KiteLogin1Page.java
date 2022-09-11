package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
	//step:1 variable declaration
	@FindBy(xpath="//input[@type='text']")     private WebElement UserId;
	@FindBy(xpath="//input[@type='password']") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")  private WebElement loginButton;

	//step:2 variable initialization
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//step:3 variable uses
	public void enterUserId()
	{
		UserId.sendKeys("KXW990");
	}
	
	public void enterPassword()
	{
		Password.sendKeys("Safwan1802@");
	}

	public void clickOnLogin()
	{
		loginButton.click();
	}

}
