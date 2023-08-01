package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Byjus_Base_Class {
	
	public WebDriver driver;
	  
	  @BeforeMethod
	  
	  public void Initialization() {
		  
		  System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Installer\\chromedriver_win32");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 
			 driver.get("https://www.byjus.com/");
			 
			 
			}
	  
	  @AfterMethod
	  
	  public void TearDown() throws InterruptedException {
		  
		  Thread.sleep(5000);
		  driver.quit();

}
	  
}
