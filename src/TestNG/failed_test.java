package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failed_test {
  @Test
  public void TC1() 
  {
	  Reporter.log("Running TC1",true);
  }
  
  @Test
  public void TC2() 
  {
	  Assert.fail();
	  Reporter.log("Running TC2",true);
  }
  
  @Test
  public void TC3() 
  {
	  Reporter.log("Running TC3",true);
  }
  
  @Test
  public void TC4() 
  {
	  //Assert.fail();
	  Reporter.log("Running TC4",true);
  }
  
  @Test
  public void TC5() 
  {
	  //Reporter.log("Running TC5",true);
	  
  }
}
