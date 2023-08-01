package TestingFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Enabled {
	   
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void Setup() {
		
		 System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
	}
    
	  
	   @Test(priority = 0)
	   public void B() {
		  boolean logo1 = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		  System.out.println(logo1);
		  System.out.println("B");
		  
	   }
	   
	   @Test(enabled = false)
	   public void A() {
		  boolean logo1 = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		  System.out.println(logo1);
		  System.out.println("A");
	   }
	   
	   @Test(enabled = false)
	   public void Test1() {
		   
		   System.out.println("Test1");
		   
	   }
	   
	   @Test(enabled = true)
	   public void Test2() {
		   
		   System.out.println("Test2");
		   
	   }
	   
	   @Test(enabled = true)
	   public void Test3() {
		   
		   System.out.println("Test3");
		   
	   }
	   
	   @AfterClass
	   public void Teardown() throws InterruptedException{
		   
		   Thread.sleep(5000);
		   driver.quit();
	   }
	   
}
