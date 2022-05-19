package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingActionsClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement homepagebutton = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		Thread.sleep(2000);

		Actions act=new Actions(driver);
		
		//act.click(homepagebutton).perform();
		
		act.moveToElement(homepagebutton).perform();
		Thread.sleep(2000);
		act.click().perform();
		
		

	}

}
