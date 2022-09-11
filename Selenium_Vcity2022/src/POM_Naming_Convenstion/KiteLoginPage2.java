package POM_Naming_Convenstion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage2 
{
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement contButton;
	
	public KiteLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void inpKiteLoginPage2Pin()
	{
		pin.sendKeys("180216");
	}
	public void clickKiteLoginPage2contButton()
 	{
		contButton.click();
	}
}
