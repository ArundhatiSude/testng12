package BYJUSAss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Byjus1 {
	
  WebDriver driver;
  
  @BeforeMethod
  
  public void get() {
	  
	  System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
	    
	     driver= new ChromeDriver();
	     
	     driver.get("https://www.byjus.com/");
	     
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	     

  }
  
  @Test
    public void setup() {
	  
  }

}
