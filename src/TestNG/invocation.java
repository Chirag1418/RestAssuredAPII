package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class invocation {
  @Test
  public void mymethod() 
  {
	  Reporter.log("this is my method",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("running before method",true);

  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("running after method",true);

  }

  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("running before class",true);
  }

  @AfterClass(dependsOnMethods="mymethod")
  public void afterClass() 
  {
	  Reporter.log("running after class",true);

  }
  

}
