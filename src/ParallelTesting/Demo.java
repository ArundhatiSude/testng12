package ParallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	   
   WebDriver driver;
   
   @Test
   
   public void setup() {
	   
	// WebDriverManager.chromedriver.setup();
	   System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");  
	 
	 driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
   }
   
   @Test
   
   public void setup1() {
   
  // WebDriverManager.chromedriver.setup();
	   System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
	 
	 driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 
	 driver.get("https://www.facebook.com/");
	 
   }
	 
	 

}
