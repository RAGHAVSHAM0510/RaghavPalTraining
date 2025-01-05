package UtilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class Listener extends BaseClass implements ITestListener {
	private ExtentReports extentReports;
	private ExtentTest extentTest;

	@Override
	public void onStart(ITestContext context) {
		String suiteName = context.getSuite().getName();
		extentReports = new ExtentReports();
		String path = System.getProperty("user.dir") + "//ExtentReports//" + DateAndTime.getYear() + "//"
				+ DateAndTime.getMonthYear() + "//" + DateAndTime.getDateMonthYear() + "//" + suiteName
				+ DateAndTime.getDateTime() + ".html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		extentReports.attachReporter(reporter);
	}

	@Override
	public void onTestStart(ITestResult result) {
		extentTest = extentReports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "Test Case Pass Name is ::" + result.getMethod().getMethodName());

		extentTest.addScreenCaptureFromPath(
				TakeScreenshot.captureScreenshot("PassScreenshot", result.getMethod().getMethodName()));

	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, "Test case Fail Name is :: " + result.getMethod().getMethodName());

		extentTest.addScreenCaptureFromPath(
				TakeScreenshot.captureScreenshot("FailScreenshot", result.getMethod().getMethodName()));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "Test Skip name is " + result.getMethod().getMethodName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();

	}

}
