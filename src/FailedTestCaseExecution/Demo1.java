package FailedTestCaseExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	   
   @Test
   
   public void Test1() {
	   
	   System.out.println("Test1");
	   Assert.assertEquals(true, true);
   }
   
   @Test
   
   public void Test2() {
	   
	   System.out.println("Test2");
	   Assert.assertEquals(false, true);
   }
   
   @Test
   
   public void Test3() {
	   
	   System.out.println("Test3");
	   Assert.assertEquals(true, true);
   }

}
