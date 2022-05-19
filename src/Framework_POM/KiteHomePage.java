package Framework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUserID()
	{
		String expectedUserID = "HD5857";
	
		String actualUserID = userID.getText();
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("UserID matching TC is passed ");
		}
		else 
			{
				System.out.println("UserID not matching TC is failed ");
			}
		}
	
		
		public void logout() throws InterruptedException
		{
			userID.click();
			Thread.sleep(100);
			logOutButton.click();
			
			
		}
		
		
		
	
	

}

