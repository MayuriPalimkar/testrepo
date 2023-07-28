package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sum3 {

	@Parameters({"a","b"})
	@Test
	public void add(int a, int b) {
		int mul = a*b;
		System.out.println("multiplication is = "+mul);
	}
}
