package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://auth.discoveryplus.in/login");
		driver.manage().window().maximize();
		
		
		WebElement number = driver.findElement(By.id("mobileNumber"));
		number.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		number.sendKeys("8776654436");
		
		
	   WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	   
	   WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(2000));

		w.until(ExpectedConditions.visibilityOf(button));
		
		button.click();
		
		
		

	}

}
