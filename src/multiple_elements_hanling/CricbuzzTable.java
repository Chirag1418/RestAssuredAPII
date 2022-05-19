package multiple_elements_hanling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzTable {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Sucess Story\\Drivers Jars\\selenium-java-4.1.2\\chromedriver_win32y\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/40353/pak-vs-aus-2nd-test-australia-tour-of-pakistan-2022");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> table = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[3]//div[@class='cb-col cb-col-100 cb-scrd-itms']"));
		
		int row = table.size();
		System.out.println(row);
		
		for(WebElement o:table)
		{
			System.out.println(o.getText());
		}
		
		
	}

}
