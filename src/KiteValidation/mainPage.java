package KiteValidation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPage 
{
	 @FindBy(xpath="//span[@class='user-id']") private WebElement IDofUser;
	 
	 @FindBy(xpath="//a[@target='_self']") private WebElement logout;
	 
	 public mainPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public String UserText()
	 {
		 String actualUserId = IDofUser.getText();
		 return actualUserId;
	 }
	 
	 public void logoutbutton() throws InterruptedException
	 {
		 IDofUser.click();
		 Thread.sleep(2000);
		 logout.click();
	 }
	 
}
