package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_elem_methods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/?gclid=CjwKCAiAx8KQBhAGEiwAD3EiP5Ndbknje797OW-OUDtDLASVL1JFVutnhrf3ykAtHSfA3f_JIu8FFhoCd34QAvD_BwE");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(2000);
		WebElement GetOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		Thread.sleep(10000);
		boolean BooleanStatus = GetOTPButton.isEnabled();
		Thread.sleep(10000);
		WebElement MobileNumber = driver.findElement(By.id("mobileNumber"));
		Thread.sleep(10000);
		
		if(BooleanStatus)
		{
			GetOTPButton.click();
			Thread.sleep(10000);
		}
		else
		{
			System.out.println("get OTP is disabled, enter mobile number ");
			
			MobileNumber.sendKeys("8978697859");
			Thread.sleep(10000);
			GetOTPButton.click();
			
		}
		
		
		
		

	}

}
