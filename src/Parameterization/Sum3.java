package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum3 {
    	 
    	 @Parameters({"a","b"})
    	   
    	   @Test
    	   
    	   public void sub(int a,int b) {
    		   
    	   int div = a/b;
    	   
    	   System.out.println("sum of two number--->"+div);
    		   
    	   }

}
