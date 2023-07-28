package Assertions;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_assertions {

	@Test
	public void demo() {
		System.out.println("Hello goodMorning");
		Assert.assertTrue(true);
		System.out.println("Java");
		
		Assert.assertEquals("Welcome", "Welcomen");  //false
		System.out.println("Excecution completed");
	}
	
	@Test
	public void demo2() {
		Assert.assertTrue(true);
		System.out.println("Hi good morning");
		Assert.assertEquals("Java", "Python");
		System.out.println("execution completed");
		
	}
	
	@Test
	public void demo3() {
		Assert.assertTrue(true);
		System.out.println("Hi....");
		Assert.assertEquals("Java", "Java");
		System.out.println("Excecution completed");
	}
}
