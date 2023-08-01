package Assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions1 {
	  
	WebDriver driver;
	
	@BeforeMethod
	
	public void Setup() {
		
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
	    
	driver = new ChromeDriver();
	    
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangeHRMlive.com/web/index.php/auth/login/");
	
	}
	
	@Test
	public void OrangeHRM() {
		
	WebElement UName = driver.findElement(By.name("username"));
	
	UName.sendKeys("arundhati");
	
	WebElement pass = driver.findElement(By.name("password"));
	
	pass.sendKeys("123456789");
		
	}
	


}
