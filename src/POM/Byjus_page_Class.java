package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Byjus_page_Class {
	   
	   WebDriver driver;
	   
	   public  Byjus_page_Class(WebDriver driver) {
		   
		   this.driver=driver;
		   
		   PageFactory.initElements(driver, this);
		  
	   }
	   
	   @FindBy(xpath="//button[@id=\"home-btn\"]")
	   public WebElement Button;
	   
	   @FindBy(xpath="//input[@id=\"name-input\"]")
	   public WebElement Name;
	   
	   @FindBy(xpath="//input[@id=\"name-input\"]")
	   public WebElement MobileNo;
	   
	   @FindBy(xpath="//button[contains(text(),'Send OTP')]")
	   public WebElement otp;
	   
	   @FindBy(xpath="//select[@id=\"formCity\"]")
	   public WebElement City;
	   
	   @FindBy(xpath="//select[@id=\"formCenter\"]")
	   public WebElement Center;
	   
	   public void Goto() {
		   
		   driver.get("https://www.byjus.com/btc/");
	   }
	   
	   public void Login_click() {
		   
		   Button.click();
	   }
	   
	   //Name
	   
	   public void Name1(String A_Name) {
		   
		   Name.sendKeys("name");
		   
		    }
	   
	   public void Mobile(String M_MobileNo) {
		   
		   MobileNo.sendKeys("MobileNo");
		   
	   }
	   
	   public void otp_click() {
		   
		   otp.click();
	   }
	   
      public void City_click() {
    	  
    	City.click();
    	Select S1 = new Select(City);
    	S1.selectByVisibleText("Kolkata");
    	
    	 }
      
      public void Center_click() {
    	  
    	  Center.click();
    	  Select S1 = new Select(Center);
      	  S1.selectByVisibleText("344");
      	  
      	  
      	  
      	
      }
}
