package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ElearningLoginPage.BYJUS;

public class BaseorTestClass {

	@SuppressWarnings("rawtypes")
	@Test
	public void setup() throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.byjus.com/btc/");
		 
		 driver.manage().window().maximize();
		 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		 Byjus_page_Class BP = new  Byjus_page_Class(driver);
		 
		 
		 BP.Goto();
		 BP.Login_click();
		 
		 //name
		 
		 BP.Name1("Arundhati");
		 
		
		 BP.Mobile("8275425500");
		 
		 //click otp
		 BP.otp_click();
		 Thread.sleep(20000);
		 
		 
		    //city
		 BP.City.click();
		//  WebElement city = driver.findElement(By.id("formCity"));
//			city.click();
//			Select select = new Select(city);
//			select.selectByValue("Ambala");
			Thread.sleep(3000);
		 
			//center
		 BP.Center.click();
		 WebElement center = driver.findElement(By.id("formCenter"));
//			center.click();
//			Select select1 = new Select(center);
//			select1.selectByValue("344");
			Thread.sleep(3000);
		 
		 BP.Button.click();
		 
		 
		 
		 
		 

			driver.findElement(By.xpath("//input[@id=\"class-five\"]")).click();

			driver.findElement(By.xpath("//button[@class=\"btn modal-form-submit-btn\"]")).click();
		
		 
		 
		
		 
		 
		 
		 

	}

	

}
