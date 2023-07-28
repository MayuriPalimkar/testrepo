package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assertions {

	@Test
	public void demo() {
		SoftAssert soft = new SoftAssert();
		System.out.println("Execution started");
		
		soft.assertEquals("welcome", "welcome1");
		soft.assertEquals(true, true);
		
		System.out.println("Execution completed");
		System.out.println("Hello");
		
	}
	
	@Test
	public void demo2() {
		SoftAssert soft = new SoftAssert();
		System.out.println("Execution started demo2");
		soft.assertEquals("welcome", "welcome1");
		soft.assertEquals(true, true);
		
		System.out.println("Execution completed");
		System.out.println("Hello");
		soft.assertAll();
		
		
	}
}
