package Framework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class growwLoginPage 
{
	@FindBy(xpath="(//div[@class='absolute-center btn51ParentDimension'])[1]")private WebElement LoginIcon;
    @FindBy(id="login_email1") private WebElement UserID;
   // @FindBy(id="login_password1") private WebElement password;
    @FindBy(xpath="//span[text()='Continue']") private WebElement ContinueButton;
    @FindBy(xpath="//input[@type='password']") private WebElement password;

    
    
    
    public growwLoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void UserID() throws InterruptedException
    {
    	LoginIcon.click();
    	Thread.sleep(2000);
    	UserID.sendKeys("lotlikarchirag@gmail.com");
    	//Thread.sleep(2000);
    	//password.sendKeys("Groww@123");
    }
    
    public void ContinueButton() throws InterruptedException
    {
    	ContinueButton.click();
    	Thread.sleep(2000);
    }
    
    public void password()
    {
    	password.sendKeys("Groww@123");
    }
}
