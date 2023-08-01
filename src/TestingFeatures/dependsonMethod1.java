package TestingFeatures;

import org.testng.annotations.Test;

public class dependsonMethod1 {
	   
	   @Test
	   public void LoginTest() {
		   
		   System.out.println("LoginTest");
		   int number = 10/0;
		   
	   }
	   
	   @Test(dependsOnMethods="LoginTest")
	   public void Homepage() { //5
		   
		   System.out.println("Homepage");
	   }
	   
	   @Test(dependsOnMethods="LoginTest")
	   public void Searchpage() { //8
		   
		   System.out.println("Searchpage");
	   }
	   
	   @Test
	   public void RefreshPage() { //8
		   
		   System.out.println("RefreshPage");
	   }
	   
	   
	
	

}
