package com.vit.pages.login;

import com.vit.utils.base.BaseTests;
import org.testng.annotations.Test;
import com.vit.pages.LoginPage;
import com.vit.pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

	@Test
    public void testSuccessfulLogin(){
	
	
	
	
    
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText()
                .contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
