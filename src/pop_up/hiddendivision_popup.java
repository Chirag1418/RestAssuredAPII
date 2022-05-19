package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivision_popup {

	public static void main(String[] args)
	{
		
       System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\selenium-java-4.1.2\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
	}

}
