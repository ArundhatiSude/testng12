package KhanAcademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KhanAcademyASS {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.khanacademy.org/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
				driver.findElement(By.id("login-or-signup")).click();
				
				  JavascriptExecutor JS=(JavascriptExecutor) driver; 
				  
				 // JS.executeScript("arguments[0].scrollIntoView",Element); 
				  
				  driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("arsude94@Gmail.com");
				  
				  driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("8668283286");
				  
				  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
				  
	}
	
				  

				  
				  
				  

	}






