package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement firsttab = driver.findElement(By.xpath("(//button[@class='whButtons'])[2]"));
		WebElement firsttab1 = driver.findElement(By.xpath("(//button[@class='whButtons'])[1]"));
		WebElement firsttab2 = driver.findElement(By.xpath("(//button[@class='whButtons'])[3]"));


		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.moveToElement(firsttab).click(firsttab).build().perform();
		Thread.sleep(2000);

		act.moveToElement(firsttab1).click().build().perform();
		
		Set<String> idofall = driver.getWindowHandles();
		
		Iterator<String> it = idofall.iterator();
		
		String idofmainpage = it.next();
		
		String idofchild = it.next();
		Thread.sleep(2000);

		driver.switchTo().window(idofchild);
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement textbox = driver.findElement(By.id("firstName"));
		textbox.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		textbox.sendKeys("chorag");
		
		driver.switchTo().window(idofmainpage);
		
		act.moveToElement(firsttab2).click(firsttab2).build().perform();
		Thread.sleep(20000);
		//driver.close();
		
		
		
		
		
		
		

	}

}
