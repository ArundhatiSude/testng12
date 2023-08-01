package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	
	//1.BeforeSuite
	@BeforeSuite
	
	public void Setup() {
		
		System.out.println("BeforeSuite--SystemProperty");
		
	}
	
	//2.BeforeTest
	@BeforeTest
	
	public void url() {
		
		System.out.println("BeforeTest--Enterurl");
	}
	
	//3.BeforeClass
	@BeforeClass
	
	public void LaunchBrowser() {
		
		System.out.println("BeforeClass--LaunchBrowser");
		
	}
	
	//4.BeforeMethod
	@BeforeMethod
	
	public void Login() {
		
		System.out.println("BeforeMethod--LoginApplication");
		
	}
	 //Test Annotation
	@Test
	
	public void GoogleTitle1() {
		
		System.out.println("@Test--GoogleTitle1");
		
	}
	
	@Test
	
	public void GoogleTitle2() {
		
		System.out.println("@Test--Google");
		
	}
	
	//postcondition
	//5.AfterSuite
	@AfterMethod
	
	public void Logout() {
		
		System.out.println("@AfterMethod--LogoutfromApplication");
		
	}
	
	//6.AfterClass
	@AfterClass
	
	public void CloseBrowser() {
		
		System.out.println("@AfterClass--CloseBrowser");
	}
	
	//7.AfterTest
	@AfterTest
	
	public void deleteCookies() {
		
		System.out.println("@AfterTest--deleteCookies");
	}
	
	//8.AfterSuite
	@AfterSuite
	
	public void logout() {
		
		System.out.println("@AfterSuite--LogoutApplication");
	}
	
	@Test
	public void googleTitle3() {
		
		System.out.println("@Test--->googleTitle3");
		
		
		
	}

}
