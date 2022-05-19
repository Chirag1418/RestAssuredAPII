package testNG200;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_Exclude {
  @Test
  public void a() 
  {
	  Reporter.log("Test a running",true);
  }
  
  @Test
  public void b() 
  {
	  Reporter.log("Test b running",true);
  }
  
  @Test
  public void c() 
  {
	  Reporter.log("Test c running",true);
  }
  
  @Test
  public void d() 
  {
	  Reporter.log("Test d running",true);
  }
}
