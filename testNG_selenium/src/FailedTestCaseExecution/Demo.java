package FailedTestCaseExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void test1() {
		System.out.println("Test 1");   //pass
		Assert.assertEquals(true,true);
	}

	@Test
	public void test2() {
		System.out.println("Test 2");   //fails
		Assert.assertEquals(true,false);
	}
	@Test
	public void test3() {               //pass
		System.out.println("Test 3");
		Assert.assertEquals(true,true);
	}


}
