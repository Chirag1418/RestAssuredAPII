package Framework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class growwMainPage 
{
   @FindBy(xpath="//p[@class='truncate headerDggnd']") private WebElement ActualUserName;
   @FindBy(xpath="(//img[@class='circle'])[1]") private WebElement RightCornerUserIcon;
   @FindBy(xpath="(//div[@class='settingItem valign-wrapper'])[4]") private WebElement logout;
   
   public growwMainPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
  
   
   public void validatingUsername() throws InterruptedException
   {
	   RightCornerUserIcon.click();
	   Thread.sleep(2000);
	   String ActualText = ActualUserName.getText();
	   Thread.sleep(2000);
	   String ExpectedText = "lotlikarchirag@gmail.com";

	   if(ActualText.equals(ExpectedText))
	   {
		   System.out.println("Test Case is passed");
	   }
   }
   
   public void logout() throws InterruptedException
   {
	   Thread.sleep(2000);

	   logout.click();
   }
   
   
}
