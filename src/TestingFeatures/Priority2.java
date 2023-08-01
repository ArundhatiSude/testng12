package TestingFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority2 {
	   
	//Test Execution order with priority 
	   
	   WebDriver driver;
	   @SuppressWarnings("deprecation")
	   @BeforeClass
	   public void setup() {
		   
		   System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
	   }
	   @Test(priority = 1)
	   public void c() {
		  boolean logo1 = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		  System.out.println(logo1);
		  System.out.println("C");
		  
	   }
	   
	   @Test(priority = 2)
	   public void A() {
		  boolean logo1 = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		  System.out.println(logo1);
		  System.out.println("A");
	   }
	   
	   @Test(priority = 0)
	   public void B() {
		  boolean logo1 = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		  System.out.println(logo1);
		  System.out.println("B");
		  
	   }
	   
	   @Test(priority = -1)
	   public void D() {
		  boolean logo1 = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		  System.out.println(logo1);
		  System.out.println("D");
	   }
	
	   @AfterMethod
	   public void Teardown()throws InterruptedException{
		   
		   Thread.sleep(4000);
		   
		   driver.quit();
		   
		    }

}


