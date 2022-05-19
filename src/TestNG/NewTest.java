package TestNG;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void method1() throws InterruptedException 
  {
	  System.out.println("Welcome to testNG");
	
	  
  }
  @Test(dependsOnMethods="method1")
  public void method2() 
  {
	  System.out.println("Welcome to testNG11");
	  
	  
  }
  
  @Test(timeOut=1000)
  public void method3() throws InterruptedException 
  {
	  System.out.println("Welcome to testNG22");
	  Thread.sleep(2000);
	  
  }
}
