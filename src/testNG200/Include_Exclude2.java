package testNG200;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_Exclude2 {
  
  @Test
  public void f() 
  {
	  Reporter.log("Test f running",true);
  }
  
  @Test
  public void g() 
  {
	  Reporter.log("Test g running",true);
  }
  
  @Test
  public void h() 
  {
	  Reporter.log("Test h running",true);
  }
  
  @Test
  public void i() 
  {
	  Reporter.log("Test i running",true);
  }
}
