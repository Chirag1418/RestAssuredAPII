package auto_suggestions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eg_new1 {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
		//List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr//td"));

		//table[@id='product']//tr//td
		//Iterator<WebElement> it = table.iterator();
		//System.out.println(it.next().getText());
		//System.out.println(it.next().getText());

		for(WebElement o:table)
		{
			//if(o.getText().equals("Velocity Trainers Master Selenium Automation"))
			System.out.println(o.getText());
		}
		
		//for(int i=0;i<=table.size()-1;i++)
		{
		 // System.out.println();
		}
		
		
	}

}
