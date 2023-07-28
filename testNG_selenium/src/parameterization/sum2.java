package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sum2 {

	@Parameters({"a","b"})
	@Test
	public void add(int a, int b) {
		int sub = a-b;
		System.out.println("subtraction is = "+sub);
	}
}
