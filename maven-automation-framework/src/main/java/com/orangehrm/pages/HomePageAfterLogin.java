package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.common.WebDriverFactory;

public class HomePageAfterLogin {
	//WebElement
	@FindBy(id="welcome")
	WebElement vWelcometxt;
	
	//Default constructor
	public HomePageAfterLogin(){
		
		PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
	}
	
	//Generic methods returning respective page objects
	public HomePageAfterLogin checkWelcometxt(String txt){
		Assert.assertEquals(vWelcometxt.getText(), txt);
		
		return this;
		
	}
}
