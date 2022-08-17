package com.bjs.learning.automation.SeleniumAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodaysDealPage extends BasePage{
	
	public TodaysDealPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[text()='All Deals & Offers']")
	//@FindBy(xpath="//*[text()='All Deals']")
	private WebElement _linkAllDealsAndOffers;
	
	@FindBy(xpath = "//*[@data-csa-c-content-id='nav_cs_mobiles']")
	private WebElement _linkMobiles;
	
	public void clickOnAllDealsAndOffers() {
		_linkAllDealsAndOffers.click();
	}
	

	public MobilesPage clickOnMobile(){
		_linkMobiles.click();
		return new MobilesPage(getDriver());
	}

	//getDriver().findElement(By.xpath("//*[text()='All Deals & Offers']")).click();
}
