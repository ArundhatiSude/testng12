package BYJUSAss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ByjusASS2 {
	   
   WebDriver driver;
   @BeforeMethod
   public void Setup() {
	   
	   System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
		
	    
	   driver= new ChromeDriver();
	     
	   driver.get("https://www.byjus.com/btc/");
			
	   driver.manage().window().maximize();
			
	   driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			
			
	 }
   
   
   @Test
   
   public void Byjus() throws InterruptedException {
	   
	   driver.findElement(By.id("home-btn")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Arundhati");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("mobile")).sendKeys("8275425500");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
		
		Thread.sleep(6000);
		
		WebElement city = driver.findElement(By.xpath("//select[@name=\"cityname\"]"));
		Select S1 = new Select(city);
		S1.selectByVisibleText("Delhi");
		Thread.sleep(5000);
		
		WebElement center = driver.findElement(By.xpath("//select[@name=\"centername\"]"));
		Select S2 = new Select(center);
		S2.selectByVisibleText("Delhi-Dwarka");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(5000);
		
		
   }
   
   @AfterMethod
   
   public void TearDown() throws InterruptedException {
	  
	   Thread.sleep(4000);
		driver.quit();
	   
   }

}
