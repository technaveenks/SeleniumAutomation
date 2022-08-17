package com.bjs.learning.automation.SeleniumAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	// Section 01 - Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Section 02 - Locator
	@FindBy(xpath = "//*[@data-csa-c-content-id='nav_cs_gb']")
	private WebElement _linkTodaysDeal;
	
	@FindBy(xpath = "//*[@data-csa-c-content-id='nav_cs_mobiles']")
	private WebElement _linkMobiles;

	// Section 03 - Actions on the Locator
	public TodaysDealPage clickOnTodaysDeal() {
		_linkTodaysDeal.click();
		return new TodaysDealPage(getDriver());
	}
	
	public MobilesPage clickOnMobile(){
		_linkMobiles.click();
		return new MobilesPage(getDriver());
	}

	//todaysDealPage = new TodaysDealPage(getDriver());
}
