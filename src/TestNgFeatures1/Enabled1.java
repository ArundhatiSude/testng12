package TestNgFeatures1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Enabled1 {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void Setup() { //1 4 //7
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}
	
	@Test
	
	public void B() { //2
		boolean logo1 = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(logo1);
		System.out.println("B");
	}
	
	@Test(enabled=false)
	public void A() {
		
		boolean logo1 = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(logo1);
		System.out.println("A");
		
	}
	
	@Test(enabled=false)
	public void Test1() {
		
		System.out.println("Test1");
	}
	
	@Test(enabled=true)
	public void Test2() { //5
		
		System.out.println("Test2");
	}
	
	@Test(enabled=true)
	public void Test3() { //8
		
		System.out.println("Test3");
	}
	
	@AfterMethod //3 //6 //9
	public void TearDown() throws InterruptedException {
		
		Thread.sleep(5000);
		
	}
	
	

}
