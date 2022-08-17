package com.bjs.learning.automation.SeleniumAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilesPage extends BasePage{

	public MobilesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[text()='Starting ₹6,999']")
	private WebElement _linkMobiesUnder7000;
	
	public void clickOnMobilesUnder7000() {
		_linkMobiesUnder7000.click();
	}

}
