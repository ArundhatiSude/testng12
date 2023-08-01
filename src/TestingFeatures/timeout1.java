package TestingFeatures;

import org.testng.annotations.Test;

public class timeout1 {
	   
	   @Test(timeOut=10000)
	   public void lOginTest() throws InterruptedException{
		   
		   for(;;) {
			   
			   System.out.println("Hello");
		   }
		   
	   }
	 

}
