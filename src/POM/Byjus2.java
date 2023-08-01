package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.Byjus_Base_Class;

   public class Byjus2 extends Byjus_Base_Class {
	
	public void Byjus(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	//2
	
	@FindBy(id="ftc-online")
	public WebElement online;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	public WebElement Name;
	
	@FindBy(xpath ="//input[@type=\"text\"]")
	public WebElement MN;
	
	@FindBy(xpath="//button[contains(text(),'Send OTP')]")
	public WebElement button;
	
	@FindBy(xpath = "//input[@type=\"email\"]")
	public WebElement Email;
	
	@FindBy(xpath="//select[@name=\"State\"]")
	public WebElement State;
	
	@FindBy(xpath="//select[@name=\"grade\"]")
	public WebElement Class;
	
	@FindBy(xpath="//button[contains(text(),'Schedule a Free Class')]")
	public WebElement Text;
	
	
	
	//3
	
	public void SelectOnline() {
		
		online.click();
		
	}
	
	public void SetName(String Uname) {
		
		Name.click();
	}
	
	public void SetMN(String Mname) {
		
		MN.click();
	}
	
	public void ClickOtp() {
		
		button.click();
	}
	
	public void SetEmail(String email) {
		
		Email.sendKeys("arsude@gmail.com");
		
	
	}
	
	public void SelectState() {
		
		Select S1 = new Select(State);
		S1.selectByVisibleText("Maharashtra");
		
	}
	
	public void SelectClass() {
		
		Select S2 = new Select(Class);
		S2.selectByVisibleText("Class 6");
		
		
	}
	
	public void SetText() {
		
		Text.click();
	}
	
	
	
	
	
	
	 

}
