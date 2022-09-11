package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
@FindBy(xpath ="//span[@class='user-id']") private WebElement UserId;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyKiteHomePageUserId()
	{
		String actUserId = UserId.getText();
		String expUserId ="KXW990";
		
		if(actUserId.equals(expUserId))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
