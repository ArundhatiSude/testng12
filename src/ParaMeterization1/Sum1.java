package ParaMeterization1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum1 {
	
	@Parameters({"a","b"})
	@Test
	public void Add(int a,int b) {
		
		int Sum = a+b;
		
		System.out.println("Sum of two number--->"+Sum);
		
	}

}
