package com.bjs.learning.automation.SeleniumAutomation.tests;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bjs.learning.automation.SeleniumAutomation.pages.HomePage;
import com.bjs.learning.automation.SeleniumAutomation.pages.MobilesPage;
import com.bjs.learning.automation.SeleniumAutomation.pages.TodaysDealPage;
import com.bjs.learning.automation.SeleniumAutomation.util.BaseTest;

public class LoginTests extends BaseTest {
	HomePage homePage;
	TodaysDealPage todaysDealPage;
	MobilesPage mobilesPage;

	@Test()
	public void verifyReports() {
		System.out.println(" Reports Test ");
	}

	@Test()
	public void verifyLoginTest() {
		System.out.println(" Login Test ");
	}

	@Test
	public void verifyHomePage() throws InterruptedException {
		// getDriver().findElement(By.xpath("//*[@data-csa-c-content-id='nav_cs_gb']")).click();
		todaysDealPage = homePage.clickOnTodaysDeal();
		Thread.sleep(2000);
		todaysDealPage.clickOnAllDealsAndOffers();
		// getDriver().findElement(By.xpath("//*[text()='All Deals &
		// Offers']")).click();
		Thread.sleep(2000);
		mobilesPage = todaysDealPage.clickOnMobile();
		mobilesPage.clickOnMobilesUnder7000();

	}

	@Test
	public void testCaseSkipException() {
		System.out.println("Im in skip exception");
		throw new SkipException("Skipping this exception");
	}

	@Test
	public void verifyHome() {

		getDriver().get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
	}

	@BeforeClass
	public void setup() {
		homePage = new HomePage(getDriver());

	}

}
