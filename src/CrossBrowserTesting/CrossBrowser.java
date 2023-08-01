package CrossBrowserTesting;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowser {
	
	WebDriver driver;
	@Parameters("Browsername")
	@Test
	
	public void OrangeHRM(String Browsername) {
	
	if(Browsername.equalsIgnoreCase("Chrome")) {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\arsud\\Downloads\\chromedriver_win32 (3)");
	    driver = new ChromeDriver();
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("start-maximized");
	    option.addArguments("test-type");
	     
	    option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	    option.setExperimentalOption("useAutomationExtension", true);


	    Map<String, Object> prefs = new HashMap<String, Object>();
	    Map<String, Object> langs = new HashMap<String, Object>();
	    langs.put("language symbol here (originally)", "en");
	    prefs.put("translate", "{'enabled' : true}");
	    prefs.put("translate_whitelists", langs);
	    option.setExperimentalOption("prefs", prefs);

	}
	
	else if(Browsername.equalsIgnoreCase("Firefox")) {
	
	System.setProperty("Webdriver.Firefox.driver","C:\\Users\\arsud\\Downloads\\Firefox Installer.exe");
    driver = new FirefoxDriver();
   
	}
	
	else if(Browsername.equalsIgnoreCase("Edge")) {
		
		System.setProperty("Webdriver.edge.driver","C:\\Users\\arsud\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    driver = new EdgeDriver();
	}
	
   else if(Browsername.equalsIgnoreCase("IE")) {
		
		System.setProperty("Webdriver.IE.driver","C:\\Users\\arsud\\Downloads\\IEdriverserver");
	    driver = new InternetExplorerDriver();
	    
	}
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebElement UserName = driver.findElement(By.name("username"));
	
	UserName.sendKeys("Admin");
	
	WebElement Password = driver.findElement(By.name("password"));
	
	Password.sendKeys("Admin123");
	
	//String Exp_name = "Test Bembang";
	driver.findElement(By.xpath("//Button[@type=\"submit\"]")).click();
	
	//String Act_name = driver.findElement(By.xpath("//p[@@class=\"oxd-userdropdown-name\"]")).getText();
	
	//Assert.assertEquals(Act_name, Exp_name);
	
	//System.out.println("Correct username");
	
	System.out.println("Execution completed");
	
	driver.close();
	
	
	
	
	
	
	

}
	
}
