package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin1Page
{
	@FindBy (xpath = "")private WebElement user_name;
	@FindBy (xpath ="") private WebElement password ;

	
	public FacebookLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enter_userName()
	{
		user_name.sendKeys("");
	}
}
 