package FailedTestCaseExecution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser1 implements IRetryAnalyzer {

	int count = 0; //failed
    int RetryLimit = 3; //
	
	@Override
	public boolean retry(ITestResult result) {
		if(count<RetryLimit) {
			count++;
			return true;
		}
		return false;
	}
	   
   

}
