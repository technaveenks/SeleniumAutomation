package com.bjs.learning.automation.SeleniumAutomation.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listener implements ITestListener {
	private static final String CODE1 = "{\n    \"theme\": \"standard\",\n    \"encoding\": \"utf-8\n}";
	private static final String CODE2 = "{\n    \"protocol\": \"HTTPS\",\n    \"timelineEnabled\": false\n}";

	protected static ExtentReports extent;
	protected static ExtentSparkReporter spark;
	protected static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		//test.log(Status.INFO, "Test Started " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		test.pass(result.getMethod().getMethodName());
		test.log(Status.PASS, "Test passed " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		test.fail(result.getMethod().getMethodName());
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\navee\\Trainings\\SeleniumAutomation\\Screenshot\\Error.png").build());
		test.log(Status.FAIL, "Test Failed " + result.getMethod().getMethodName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		test.skip(result.getMethod().getMethodName());
		test.log(Status.SKIP, "Test Skipped " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark/Reports.html");
		extent.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		test.log(Status.INFO, "On Finish ");
		extent.flush();
	}

}
