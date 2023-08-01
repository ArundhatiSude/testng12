package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Byjus1 {
	   
	  @FindBy(xpath="//input[@id=\"ftc-online\"]")
	  public WebElement Button;
	  
	  @FindBy(xpath="//input[@type=\"text\"]")
	  public WebElement Name;
	  
	  @FindBy(xpath="//input[@name=\"mobile\"]")
	  public WebElement MN;
	  
	  @FindBy(xpath="//button[contains(text(),'Send OTP')]")
	  public WebElement button;
	  
	  @FindBy(xpath="//input[@name=\"email\"]")
	  public WebElement email;
	  
	  @FindBy(xpath="//select[@name=\"state\"]")
	  public WebElement state;
	  
	  @FindBy(xpath="//select[@name=\"grade\"]")
	  public WebElement Class;

}
