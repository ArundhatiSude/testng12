package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondProgram {
	   
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
	
	@Test(dataProvider = "LoginData")
	
	public void LoginTest(String Uname,String PWD,String Expected) throws InterruptedException {
		
        driver.get("https://admin-demo.nopcommerce.com/login");
	    
	    WebElement User = driver.findElement(By.id("Email"));
	    User.clear();
	    Thread.sleep(2000);
		User.sendKeys("Uname");
		WebElement pass = driver.findElement(By.id("Password"));
		pass.clear();
		Thread.sleep(2000);
		pass.sendKeys("PWD");
		
		driver.findElement(By.xpath("//Button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		String Act_Title = driver.getTitle();
		
		String Exp_Title = "Dashboard/nopcommerce administration";
		
		if(Expected.equals("Valid")) { //true
		if(Exp_Title.equals(Act_Title))	{
		driver.findElement(By.linkText("Logout")).click();
		
		Assert.assertTrue(true); //pass
		
		}
		else {
		Assert.assertTrue(false); //failed
		
		}
		
	}
	
	else if(Expected.equals("InValid")) { //pass
		if(Exp_Title.equals(Act_Title))	{	
		driver.findElement(By.linkText("Logout")).click();
		
		Assert.assertTrue(true); 
		
		}
		else {
		Assert.assertTrue(false); //pass
		
		}
		
}		
			
		driver.quit();
		}
		
		@DataProvider(name = "Logindata")
		public String[][] LoginData() {
		String LoginData[][] = {{"Admin@yourstore.com","Admin","Valid"},
				{"Admin@yourstore.com","Adm","InValid"},
				{"Admin1@yourstore.com","Admin","InValid"},
				{"Admin1@yourstore1.com","Admin1","InValid"},};
		
		return LoginData;
		
		}
			
		@AfterMethod
		
		public void Teardown() {
			
			driver.quit();
		}
	
	

}
