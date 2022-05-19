package multiple_elements_hanling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_checkbox {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for(WebElement o:checkboxes)
		{
			o.click();
		}
		
		for(WebElement o:checkboxes)
		{
			o.click();
		}
	}

}
