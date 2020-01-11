package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	//EplicitWait
	WebDriverWait objdrwait = new WebDriverWait(WebDriverFactory.getWebDriver(), 30);
	
	//Constructor
	public LoginPage(){
		//initialize webelements
		PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
	}
	
	//explict wait to check weblements are loaded on pageload, return type loginPage
	public LoginPage isLoginPageLoaded(){
		//wait until this element is clickable
		objdrwait.until(ExpectedConditions.elementToBeClickable(vBtnLogin));
		objdrwait.until(ExpectedConditions.elementToBeClickable(vPaswd));
		objdrwait.until(ExpectedConditions.elementToBeClickable(vUserName));
		
		return this;
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
