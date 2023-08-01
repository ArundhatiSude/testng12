package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Sum1 {
	   
   @Parameters({"a","b"})
   
   @Test
   
   public void add(int a,int b) {
	   
   int sum = a+b;
   
   System.out.println("sum of two number--->"+sum);
	   
   }
	


}
