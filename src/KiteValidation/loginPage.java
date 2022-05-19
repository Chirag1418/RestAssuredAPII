package KiteValidation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage 
{
   @FindBy (xpath="//input[@type='text']") private WebElement userID;
   @FindBy (id="password") private WebElement Password;
   @FindBy (xpath="//button[@type='submit']") private WebElement loginButton;
   
   public loginPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void enterUserID(String uid)
   {
	   userID.sendKeys(uid);
   }
   
   public void enterPassword(String pwd)
   {
	   Password.sendKeys(pwd);
   }
   
   public void clickLoginButton()
   {
	  loginButton.click();
   }
   
   
   
}
