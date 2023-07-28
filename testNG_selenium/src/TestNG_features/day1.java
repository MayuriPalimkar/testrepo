package TestNG_features;

import org.testng.annotations.Test;

public class day1 {

	@Test
	public void test1() {
		System.out.println("Hello");
	}
	
	@Test(groups = {"Smoke"})
	public void test5() {
		System.out.println("Day1-test5");
	}
}
