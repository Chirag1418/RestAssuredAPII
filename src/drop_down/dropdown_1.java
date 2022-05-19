package drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\selenium-java-4.1.2\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement DropDwon = driver.findElement(By.id("oldSelectMenu"));
		
		
		Select s=new Select(DropDwon);
		
		s.selectByVisibleText("Green");
		//s.selectByIndex(2);
		

	}

}
