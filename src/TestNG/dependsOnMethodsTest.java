package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethodsTest {
  @Test 
  public void c()  
  {
	  
	  Reporter.log("running method a",true);
  }
  
  @Test
  public void b() 
  {
	  Reporter.log("running method b",true);
  }
  
  @Test
  public void a() 
  {
	  Reporter.log("running method c",true);
  }
  
  @Test
  public void d() 
  {
	  Reporter.log("running method d",true);
  }
}
//(dependsOnMethods= {"b"})