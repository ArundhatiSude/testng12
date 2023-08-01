package ElearningLoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BYJUS {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    driver.get("https://byjus.com/");
	    
	    driver.findElement(By.id("ftc-online")).click();
	    driver.findElement(By.name("name")).sendKeys("Arundhati");
	    driver.findElement(By.name("mobile")).sendKeys("8275425500");
	    driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
	    Thread.sleep(5000);
	   // driver.findElement(By.xpath("/input[@name=\"otp\"]")).sendKeys("4567");
	    driver.findElement(By.name("email")).sendKeys("arsud94@gmail.com");
	    
	    WebElement state = driver.findElement(By.xpath("//select[@name=\"state\"]"));
	    Select S1 = new Select(state);
	    S1.selectByValue("Maharashtra");
	    Thread.sleep(2000);
	    
	    WebElement grade = driver.findElement(By.xpath("//select[@name=\"grade\"]"));
	    Select S2 = new Select(grade);
	    S2.selectByVisibleText("Class 6");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//button[contains(text(),'Schedule a Free Class')]")).click();
	    
	     driver.findElement(By.xpath("//img[@class=\"d-none d-md-block nav-arrow-desktop\"]")).click();
	    
	    driver.findElement(By.xpath("//span[@class=\"font-14 profile-view-item\"]")).click();
	    Thread.sleep(5000);
	    
	    

	}

}
