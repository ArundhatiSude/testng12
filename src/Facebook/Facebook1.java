package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Facebook1 {
	
	WebDriver driver;

	@BeforeMethod
	
	public void Setup() {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    driver.get("https://www.Facebook.com/");
	   
		 
		 
	 }
	
	@Test
	
	public void Login() {
		
		WebElement Email = driver.findElement(By.id("email"));
	    
		Email.sendKeys("arsud@gmail.com");
		
        WebElement password = driver.findElement(By.id("pass"));
	    
		password.sendKeys("123456789");
		
		
	    
	    }
	
	

}
