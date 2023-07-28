package TestNG_features;

import org.testng.annotations.Test;

public class Day2 {

	@Test(groups = {"Regression"})
	public void Test1() {
		System.out.println("hello");
	}
	
	@Test(groups= {"Smoke"})
	public void test2() {
		System.out.println("Day2- test2");
	}
	
	@Test(groups= {"Smoke"})
	public void test3() {
		System.out.println("Day2-test3");
	}
}
