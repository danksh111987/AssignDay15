package com.orangehrm.tests;

import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.pages.LoginPage;

public class LoginTests extends BaseSelenium {
	
	@Test
	public void TC1VerifyAdminLoginSuccess(){
		LoginPage lp = new LoginPage();
		
		lp.checkValidLogin("admin", "admin")
			.checkWelcometxt("Welcome Admin");
	}

}
