package TestNG_features;

import org.testng.annotations.Test;

public class dependsOnmethods {

	@Test
	public void loginTest() {
		System.out.println("LoginTest");
		int number = 10/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homepage() {
		System.out.println("Home page");
	}
	
	@Test(dependsOnMethods ="loginTest")
	public void searchpage() {
		System.out.println("Search page");
	}
	
	@Test
	public void refreshPage() {
		System.out.println("Refresh page");
	}
}
