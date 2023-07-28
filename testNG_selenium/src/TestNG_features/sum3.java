package TestNG_features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sum3 {
	
	@Parameters({"a","b"})
	@Test
	public void div(int a, int b) {
		int div = a/b;
		System.out.println("division= "+div);
	}

}
