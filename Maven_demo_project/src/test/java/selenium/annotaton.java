package selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotaton {

	//Execution sequence of annotation
	//@BeforeSuite --> setUpSystemProperty
	//@BeforeTest --> enter URL
	//@BeforeClass --> Launch browser
	
	@BeforeSuite
	public void setUP() {
		System.out.println("@BeforeSuite --> Settup systemproperty");
	}
	
	@BeforeTest
	public void URL() {
		System.out.println("@BeforeTest --> Enter url");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("@BeforeClass --> launchBrowser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod --> login application");
	}
	
	//test annotation
	@Test
	public void googletitle1() {
		System.out.println("@Test --> GoogleTitle1");
	}
	
	@Test
	public void googletitle2() {
		System.out.println("@Test2 -->  GoogleTitle2");
	}
	
	//PostCondition annotations
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod --> logoutfrom application");
	}
	
	@AfterClass
	public void closebrowser() {
		System.out.println("@AfterClass --> closeBrowser");
	}
	
	@AfterTest
	public void deletecookies() {
		System.out.println("@AfterTest --> Delete cookies");
	}
	
	@AfterSuite
	public void logout1() {
		System.out.println("@AfterSuite --> logout1");
		
	}
	
	@Test
	public void googleTitle3() {
		System.out.println("@Test -->googleTitle3");
	}
	
	
}
