package POM;

import java.awt.Button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Byjus3  {
	
	WebDriver driver;
	
	public Byjus3(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	//1
	
	@FindBy(id="name-input")
	public WebElement Name;	
	
	@FindBy(id="name-input")
	public WebElement MN;
	
	@FindBy(xpath="//button[contains(text(),'Send OTP')]")
	public WebElement otp;
	
	@FindBy(id="formCity")
	public WebElement city;
	
	@FindBy(id="formCenter")
	public WebElement center;
	
	@FindBy(xpath="//p[contains(text(),'Select your class')]")
	public WebElement SelectClass;
	
	@FindBy(id="class-eight")
	public WebElement Class;
	
	@FindBy(xpath="//button[@type=\"button\"]")
	public WebElement Button;
	
	
	 public void Goto() {
		   
		   driver.get("https://www.byjus.com/btc/");
	   }
	 
	 public void Submit() {
		 
		Button.click();
	 }
	 
	 public void name() {
		 
		 Name.sendKeys("Arundhati");
	 }
	 
	 public void mobile() {
		 
		 MN.sendKeys("8275425500");
	 }
	 
	 public void OTP() {
		 
		 otp.click();
	 }
	 
	 public void City() {
		 
		city.click(); 
		Select S1 = new Select(city);
		S1.selectByVisibleText("Dehi");
		
		 
	 }
	 
	 public void Center() {
		 
		 center.click();
		 Select S2 = new Select(center);
		S2.selectByVisibleText("344");
	 }

}
