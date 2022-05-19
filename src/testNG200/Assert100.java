package testNG200;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert100 {
  @Test
  public void TC1() 
  {
	  String a="chirag";
	  String b="ishaan";
	  
	  Assert.assertEquals(a, b,"TC failed");
  }
  @Test
  public void TC2() 
  {
	  String a="chirag";
	  String b="ishaan";
	  
	  Assert.assertNotEquals(a, b,"TC passed");
  }
  
  @Test
  public void TC3() 
  {
	  boolean result=true;
	  
	  Assert.assertTrue(result, "It is false");
  }
  
  @Test
  public void TC4() 
  {
	  boolean result=false;
	  
	  Assert.assertFalse(result, "result is true");
  }
  
  
}
