package TestNG_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueStudy {
  @Test
  public void testing() 
  {
	  boolean result = true;
	  
	  Assert.assertTrue(result, "Result is false");
  }
  
  @Test
  public void testing1() 
  {
	  boolean result = false;
	  
	 Assert.assertFalse(result, "Result is false");
  }
}
