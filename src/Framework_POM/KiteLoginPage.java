package Framework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
    @FindBy(id="userid") private WebElement UserID;
    @FindBy(id="password") private WebElement Password;
    @FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
    
    public  KiteLoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void UsedID()
    {
    	UserID.sendKeys("HD5857");
    	
    }
    public void enterPassword()
	{
		Password.sendKeys("Ajinkya@123");
	}
	
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}
	
}
