package TestNG_features;

import org.testng.annotations.Test;

public class depends_on1 {
	@Test
	public void logintest() {
		System.out.println("login test");
		int num = 10/0;
	}
	
	@Test(dependsOnMethods = "logintest")
	public void homepage() {
		System.out.println("home page");
	}
	
	@Test(dependsOnMethods = "logintest")
	public void searchpage() {
		System.out.println("search page");
	}
	
	@Test
	public void refreshpage() {
		System.out.println("Refresh page");
	}

}
