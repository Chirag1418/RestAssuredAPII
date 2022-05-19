package Framework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\Velocity\\selenium-java-4.1.2\\chromedriver_win32y\\chromedriver.exe");
			
		 WebDriver driver= new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			KiteLoginPage login= new KiteLoginPage(driver);
			login.UsedID();
			login.enterPassword();
			login.clickOnLoginButton();
			
			
			KitePinPage pin= new KitePinPage(driver);
			pin.enterPin();
			pin.clickOnContinueButton();
			
			Thread.sleep(1000);
			KiteHomePage home= new KiteHomePage(driver);
			home.validateUserID();
			home.logout();
			
			driver.close();
	}

	

	}


