package KhanAcademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KhanAcademy {
	
public static void main(String [] args ) throws InterruptedException  {
		
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);   //implicit wait applied
			
			driver.manage().window().maximize();
			
			driver.get("https://www.khanacademy.org");
			
			driver.findElement(By.xpath("//a[@id=\"login-or-signup\"]")).click();		
          //driver.findElement(By.xpath("//a[@class=\"_1sq7o4lg\"]")).click();
         
        JavascriptExecutor JS=(JavascriptExecutor) driver;    //Create a Reference
        
        WebElement Element=driver.findElement(By.xpath("//span[@class=\"_1aixq078\"]"));
         
        //2 methods of JSE-executeScript and executeAsyncScript  
        //JS.executeScript(Script,Arguments);
         JS.executeScript("arguments[0].scrollIntoView",Element);      //Call the JavascriptExecutor method
        // JS.executeAsyncScript("arguments[0].scrollIntoView();",Element);
         
         Thread.sleep(3000);        // to wait or pause
          
          driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("arsude@gmail.com");         //username
          //driver.findElement(By.xpath("//input[@class=\"_1azps1m\"]")).sendKeys("rsrbiotech@gmail.com");    //username
          driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1233455");          //password
          
          driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();  
          
          driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).click();
          
          Thread.sleep(5000);
          
         WebElement Month= driver.findElement(By.xpath("//span[contains(text(),'Month')]"));
         
          
          Select S1 = new Select(Month);
          
         S1.selectByVisibleText("Aug");
         
         Thread.sleep(5000);
         
         
        WebElement Day = driver.findElement(By.xpath("//button[@type=\"button\"]"));
        
        Select S2 = new Select(Day);
        
        S1.selectByValue("10");
        
        Thread.sleep(5000);
        
        WebElement Year = driver.findElement(By.xpath("//button[@type=\"button\"]"));
        
        Select S3 = new Select(Year);
        
        S1.selectByVisibleText("1994");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//div[contains(text(),'Continue with Google')]")).click();
        
        
        Thread.sleep(5000);
          	
        		  
}

}

	


