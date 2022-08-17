package com.bjs.learning.automation.SeleniumAutomation.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\navee\\Trainings\\SeleniumAutomation\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	}

	public WebDriver getDriver() {
		return driver;
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	public static void getscreenshot(String MethodName) throws Exception {
		//File scrFile = ((TakesScreenshot) ).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File("C:\\Users\\Hp\\Appium_Demo\\hybridfw\\screenshots\\screenshot.png"));
	}
}
