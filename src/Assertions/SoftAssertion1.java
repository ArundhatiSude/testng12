package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion1 {
	   
   @Test
   
   public void DemoTest() {
	   
	SoftAssert soft = new SoftAssert();
	System.out.println("Execution started");
	soft.assertEquals(true, true);
	System.out.println("Execution completed");
	System.out.println("Hello");
	
	soft.assertAll();
	
   }
   
   public void Demo() {
	   
   SoftAssert soft = new SoftAssert();
   System.out.println("Execution started");
   soft.assertEquals(true, true);
   System.out.println("Execution completed");
   System.out.println("Hello");
   
   soft.assertAll();
   }

}
