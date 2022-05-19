package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Annotations_study 
{
  @Test
  public void myMethod()
  {
	  Reporter.log("This is my method", true);
	  
	  System.out.println("I am method here");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("Running before method",true);
	  System.out.println("Running before method");
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("Running after method",true);
	  System.out.println("Running after method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("Running before class",true);
	  System.out.println("Running before class");
	  
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("Running after class",true);
	  System.out.println("Running after class");
  }

}
