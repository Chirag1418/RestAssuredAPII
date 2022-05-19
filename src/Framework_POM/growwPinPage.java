package Framework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class growwPinPage 
{
  //@FindBy(xpath="(//div[@class='tfaep471PinInput'])") private WebElement pin;
	@FindBy(xpath="//div[@id='otpinput88parent']//input") private WebElement pin;
  
  
  
  public growwPinPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void pin()
  {
	  pin.sendKeys("1463");
  }
}
