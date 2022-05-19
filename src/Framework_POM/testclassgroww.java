package Framework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclassgroww {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\Velocity\\selenium-java-4.1.2\\chromedriver_win32y\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://groww.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000); 
		
		growwLoginPage A=new growwLoginPage(driver);
		A.UserID();
		Thread.sleep(2000);
		A.ContinueButton();
		
		growwPasswordPage B=new growwPasswordPage(driver);
        B.password();	
        B.SubmitButton();
        
        Thread.sleep(5000);
        
        growwPinPage C=new growwPinPage(driver);
        C.pin();
        		
        Thread.sleep(4000);
        growwMainPage D=new growwMainPage(driver);
        D.validatingUsername();
        Thread.sleep(6000);
        D.logout();
        
        //driver.close();
	}

}
