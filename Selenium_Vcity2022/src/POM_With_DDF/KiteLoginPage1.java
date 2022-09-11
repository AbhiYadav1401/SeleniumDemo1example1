package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM class1
/* uid KXW990
 * pin 180216
 * pwd Safwan1802@
 */
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
		UserID.sendKeys("UID_value");
	}
	public void inpKiteLoginPage1PassWord()
	{
		PassWord.sendKeys("PWD_value");
	}
	public void clickKiteLoginPage1LoginButton()
	{
		LoginButton.click();
	}

}
