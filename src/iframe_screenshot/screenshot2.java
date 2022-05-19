package iframe_screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot2 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.fifa.com/");
		Thread.sleep(1000);		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		RandomString str=new RandomString(3);
		Thread.sleep(2000);		
		File dest=new File("C:\\Users\\admin\\Downloads\\Vel auto notes\\Screenshot\\newtest"+str+".jpg");
		Thread.sleep(1000);		
		FileHandler.copy(source, dest);
		
	}

}
