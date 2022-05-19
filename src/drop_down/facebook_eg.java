package drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_eg {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);

		WebElement listbox = driver.findElement(By.id("day"));
		
		Select s=new Select(listbox);
		
		s.selectByVisibleText("14");
		Thread.sleep(2000);
		
		WebElement listbox1 = driver.findElement(By.id("month"));
		Select s1=new Select(listbox1);
		s1.selectByVisibleText("Apr");
		//s1.selectByIndex(5);

  	}

}
