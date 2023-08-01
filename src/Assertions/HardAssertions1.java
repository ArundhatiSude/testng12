package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions1 {
	  
  @Test
  
  public void Demo() {
	  
  System.out.println("Hello good evening");
  Assert.assertTrue(true);
  System.out.println("Hello");
  Assert.assertEquals("Atomation", "Atomation");
  System.out.println("Execution completed");
  
  }
  
  @Test
  
  public void Demo1() {
	  
  Assert.assertTrue(true);
  System.out.println("Hello good morning");
  Assert.assertEquals("java", "Python");
  System.out.println("Execution completed");
  
  }
  
  @Test
  
  public void Demo2() {
	
   Assert.assertTrue(true);
   System.out.println("Hi good morning");
   Assert.assertEquals("java", "java");
   System.out.println("Execution completed");
  
  }

}
