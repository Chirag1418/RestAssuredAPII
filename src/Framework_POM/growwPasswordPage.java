package Framework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class growwPasswordPage 
{
   @FindBy(xpath="//input[@type='password']") private WebElement password;
   @FindBy(xpath="(//div[contains(@class,'btn51ParentDimension')])[1]") private WebElement SubmitButton;
   
   
   public growwPasswordPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void password()
   {
	   password.sendKeys("Groww@123");
   }
   
   public void SubmitButton()
   {
	   SubmitButton.click();
	   
   }
}
