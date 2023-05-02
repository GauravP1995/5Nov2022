package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("Test Start " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {

		System.out.println(" on Test Success " + result.getName());
	}

	public void onTestFailure(ITestResult result) {

		System.out.println(" on Test Failure " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println(" on Test Skipped " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		System.out.println(" on Test Start 1" + context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println(" on Test Finish 1" + context.getName());
	}

}
