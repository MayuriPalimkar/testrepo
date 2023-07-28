package TestNG_features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum1 {

	@Parameters({"a","b"})
	@Test
	public void add(int a, int b) {
		int add =a+b;
		System.out.println("addition ="+add);
	}
}
