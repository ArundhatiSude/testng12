package TestngFeatures;

import org.testng.annotations.Test;

public class Day1 {
	  
   @Test
   
   public void Test1() {
	   
	   System.out.println("Hello");
   }
   
   @Test(groups= {"smoke"})
   public void Test5() {
	   
	   System.out.println("Day1-Test5");
	  
	   
   }

}

