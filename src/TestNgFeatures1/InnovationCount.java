package TestNgFeatures1;

import org.testng.annotations.Test;

public class InnovationCount {
	
	@Test(invocationCount=5)
	public void m2() {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println("Sum is==:"+c);
		
	}

}
