package com.orangehrm.common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
	
	private static ThreadLocal<WebDriver> threadlevelstorage = new ThreadLocal<>();
	
	//setter method should be within package therefore protected
	
	protected static void setWebDriver(WebDriver objdr){
		
		threadlevelstorage.set(objdr);
	}
	
	//get dr from all pages even outside package therefore public
	public static WebDriver getWebDriver(){
		return threadlevelstorage.get();
		
	}
	

}
