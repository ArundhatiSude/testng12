package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum2 {
    	
    	 @Parameters({"a","b"})
    	   
    	   @Test
    	   
    	   public void sub(int a,int b) {
    		   
    	   int sub = a-b;
    	   
    	   System.out.println("sub of two number--->"+sub);
    		   
    	   }

}
