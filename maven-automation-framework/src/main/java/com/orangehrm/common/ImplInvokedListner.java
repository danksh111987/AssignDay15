package com.orangehrm.common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class ImplInvokedListner implements IInvokedMethodListener{

	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		WebDriverFactory.getWebDriver().quit();
		
	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome78ver\\chromedriver.exe");
		
		WebDriverFactory.setWebDriver(new ChromeDriver());
		//maximize window
		WebDriverFactory.getWebDriver().manage().window().maximize();
		
		WebDriverFactory.getWebDriver().get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		
	}

}
