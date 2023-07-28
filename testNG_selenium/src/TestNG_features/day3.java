package TestNG_features;

import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void test1() {
		System.out.println("Hello");
		
	}
	
	@Test(groups = {"Smoke"})
	public void test4() {
		System.out.println("Day3-test4");
	}

}
