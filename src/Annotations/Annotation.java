package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	//Excecution of sequence of Annotation 
	//@BeforeSuite - Setup SystemProperty
	//BeforeTest - Enter URL
	//@BeforeClass - Launch Browser
	//@BeforeMethod - Login Application
	//@Test         - Google TiTle1
	//@afterMethod  - LogoutFromApplication
	//@BeforeMethod - Login Application
	//@Test         - Google TiTle2
	//@afterMethod - LogoutFromApplication
	//@BeforeMethod - Login Application
	//@Test         - Google TiTle3
	//@afterMethod  -  LogoutFromApplication
	//@afterClass  -   Login Application
	//@afterClass  -    Close browser
	//@afterTest  -   Delete Cookies
		
	//Precondition Annotations

	//1- @BeforeSuite - Setup System pro
		
	// in real time  project we dont need all these notations we use onlt
	//@beforeClass @beforeMethod @Test @afterMethod @afterSuite
		
		//@beforeSuite
		
		public void Setup() {
			
			System.out.println("BeforeSetup-SystemProperty");
		}
		
		//2.BeforeTest
		@BeforeTest
		
		public void url() {
			
			System.out.println("BeforeTest--Enter url");
		}
		
		//3.BeforeClass
		@BeforeClass
		
		public void LaunchBrowser() {
			
		System.out.println("@Beforeclass--LaunchBrowser");
		}
		
		//4.BeforeMethod
		@BeforeMethod
		
		public void Login() {
			
			System.out.println("BeforeMethod--Login Application");
			
		}
		
		//Test Annotation
		@Test
		
		public void GoogleTitle1() {
			
			System.out.println("@Test--GoogleTitle1");
			
		}
		
		@Test
		
		public void GoogleTitle2() {
			
			System.out.println("@test--Google");
		}
		
		
		//postcondition Annotation
		//5.Aftersuite
		@AfterMethod
		
		public void Logout() {
			
			System.out.println("@AfterMethod--->LogoutfromApplication");
			
		}
		
		//6.@AfterClass
		@AfterClass
		public void Closebrowser() {
			
			System.out.println("@AfterClass--->Closebrowser");
		}
		
		//7.@AfterTest
		@AfterTest
		public void deletecookies() {
			
			System.out.println("@AfterTest--->DeleteCookies");
			
		}
		
		//8.@AfterSuite
		@AfterSuite
		public void logout() {
			
			System.out.println("@AfterSuite-->Logout1");
			
		}
		
		@Test
		public void googleTitle3() {
			
			System.out.println("@Test--->googleTitle3");
			
			
			
		}


		

	}



