package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.common.WebDriverFactory;

public class LoginPage {
	//WebElements
	@FindBy(id="txtUsername")
	WebElement vUserName;
	@FindBy(id="txtPassword")
	WebElement vPaswd;
	@FindBy(id="btnLogin")
	WebElement vBtnLogin;
	
	//Constructor
	public LoginPage(){
		//initialize webelements
		PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
	}
	
	
	//Generic methods should return respective page objects.
	public HomePageAfterLogin checkValidLogin(String user, String paswd){
		vUserName.sendKeys(user);
		vPaswd.sendKeys(paswd);
		vBtnLogin.click();
		
		//on successfull login it should go to homepage.
		return (new HomePageAfterLogin());
	}
	

}
