package com.bjs.learning.automation.SeleniumAutomation.tests;

import org.testng.annotations.Test;

import com.bjs.learning.automation.SeleniumAutomation.util.BaseTest;

public class AddToCartTests extends BaseTest {

	@Test(description="Test to verify search details on home page")
	public void verifySearch() {
		getDriver().get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
	}

}
