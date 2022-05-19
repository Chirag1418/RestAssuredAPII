package PositionAndSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positiontest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium-java-4.1.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
		
		Dimension d=new Dimension(300, 600);
		
		driver.manage().window().setSize(d);
		
		Point p=new Point(50, 100);
		
		driver.manage().window().setPosition(p);
	}

}
