package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.common.WebDriverFactory;

public class HomePageAfterLogin {
	//WebElement
	@FindBy(id="welcome")
	WebElement vWelcometxt;
	
	//explicit wait
	WebDriverWait objdrwait = new WebDriverWait(WebDriverFactory.getWebDriver(), 30);
	
	//Default constructor
	public HomePageAfterLogin(){
		
		PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
	}
	
	//explicit wait to check page loaded or not
	public HomePageAfterLogin isHomePageLoaded(){
		
		objdrwait.until(ExpectedConditions.elementToBeClickable(vWelcometxt));
		return this;
	}
	//Generic methods returning respective page objects
	public HomePageAfterLogin checkWelcometxt(String txt){
		Assert.assertEquals(vWelcometxt.getText(), txt);
		
		return this;
		
	}
}
