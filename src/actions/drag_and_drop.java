package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qavbox.github.io/demo/dragndrop/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		//act.moveToElement(draggable).clickAndHold().moveToElement(droppable).release().build().perform();
		act.moveToElement(draggable).clickAndHold(draggable).moveToElement(droppable).release(droppable).build().perform();
	
		
		

	}

}
