package TestNgFeatures1;

import org.testng.annotations.Test;

public class dependsonMethod {
	
	@Test
	public void LoginTest() {
		
		System.out.println("LoginTest");
		int number = 10/0;
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void HomePage() {
		
		System.out.println("Homepage");
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void SearchPage() {
		
		System.out.println("SearchPage");
		
	}
	
	@Test
	public void RefreshPage() {
		
		System.out.println("RefreshPage");
	}

}
