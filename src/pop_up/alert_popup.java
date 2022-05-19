package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println("the alert text is" +alt);
		Thread.sleep(2000);	
		alt.accept();
		//alt.getText();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(2000);	
		alt1.dismiss();

	}

}
