package TestClass1;

import org.openqa.selenium.By;
import org.testng.Assert;

import BaseClass.Byjus_Base_Class;
import POM.Byjus2;



	
	public class Byju_Test_Class extends Byjus_Base_Class{
		
		 public void Byjus() throws InterruptedException {
			
			Byjus2 BS = new Byjus2();
			BS.SetEmail("arsude@gmail.com");
			BS.SetMN("8275425500");
			BS.SetName("arundhati");
			BS.SetText();
			BS.SelectClass();
			BS.SelectOnline();
			BS.SelectState();
			
			Thread.sleep(8000);
			
			
			boolean Text = driver.findElement(By.xpath("//button[contains(text(),'Schedule a Free Class')]")).isDisplayed();
			 
			if(Text==true) {
				
				System.out.println("LOGIN PASS");
				Assert.assertTrue(true);
			}
			
			else {
				
				System.out.println("LOGIN failed");
				Assert.assertTrue(false);

}
			
		 }
		 
	}
