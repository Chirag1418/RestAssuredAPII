package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class context_click {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(rightclickbutton).perform();
		Thread.sleep(2000);
		act.contextClick(rightclickbutton).perform();
		
		WebElement tap = driver.findElement(By.xpath("//div[@id='context-menu-layer']"));
		
		Actions act1=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(tap).click().build().perform();
		
		WebElement doubletapbutton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		Actions a2=new Actions(driver);
		Thread.sleep(2000);
		
		act.moveToElement(doubletapbutton).doubleClick().build().perform();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
	}

}
