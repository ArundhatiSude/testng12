package Parameterization;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Parameter {
	 WebDriver driver;  
	@Parameters("URL")
	@BeforeMethod
	public void setup(String URL) {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
		//WebDriverManager.ChromeDriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
	}
	
	@Parameters({"UserName","Password"})
	
	public void LoginTest(String Uname,String Pass) {
		
	WebElement Useremail = driver.findElement(By.id("email"));
	Useremail.sendKeys("Uname");
	WebElement password = driver.findElement(By.id("Pass"));
	password.sendKeys("pass");
	
	driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	
	String ActualTitle = driver.getTitle();
	String Title = "Admin";
	
	if(ActualTitle.equals(Title)) {
	System.out.println("Correct Title");
	
	}
	
	else {
		
		System.out.println("Incorrect Title");
	}
	
	}
	
	public void Teardown() {
		
		driver.quit();
	}
	

		
		
}


