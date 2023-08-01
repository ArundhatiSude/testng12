package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import graphql.Assert;


public class FirstProgram {

   WebDriver driver;
   @Test(dataProvider = "LoginData")
	public void LoginTest(String UName,String PWD) {
	   System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangeHRMlive.com/web/index.php/auth/login");
	    
	    WebElement UserName = driver.findElement(By.name("username"));
		
		UserName.sendKeys("Admin");
		
		WebElement Password = driver.findElement(By.name("password"));
		
		Password.sendKeys("Admin123");
		
		String Exp_name = "Test Bembang";
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		boolean Test = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-copyright\"]")).isDisplayed();
		
		Assert.assertTrue(Test);
		
		driver.quit();
		
   }
   
   @DataProvider(name="LoginData")
   public Object[][] LoginData(){
   
   Object data[] [] = new Object[5][2];
   
   //CorrectUN & CorrectPWD
   data[0][0] = "Admin";
   data[0][1] = "admin123";
   

   
   //CUN & CPWD
   data[1][0] = "Admin";
   data[1][1] = "admin1234";
   
   //IUN & CPWD
   data[2][0] = "Admin1";
   data[2][1] = "admin123";
   
   //IUN $ IPWD
   data[3][0] = "Admin1";
   data[3][1] = "admin1234";
   
   //EmptyUN & CPWD
   data[4][0] = "Admin";
   data[0][1] = "admin123";
   
   return data;
   
   //
   
}
   
}
