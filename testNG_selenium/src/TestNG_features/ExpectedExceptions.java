package TestNG_features;

import org.testng.annotations.Test;

public class ExpectedExceptions {

	@Test(expectedExceptions = Exception.class)
	public void loginTest() throws InterruptedException {
		System.out.println("Hello");
//		try{
		
//		int number =10/0;
//	}
	//	catch(ArithmeticException e) {
	//		System.out.println("hello");
		
	int number = 10/0;
	
	}
}
