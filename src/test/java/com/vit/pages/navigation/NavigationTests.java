package com.vit.pages.navigation;

import com.vit.utils.base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    // this code to demonstrate window management
 
	 @Test
	    public void testNavigator(){
		 homePage.clickDynamicLoading().clickExample1();
		 getWindowManager().goBack();
		 getWindowManager().refreshPage();
        
        
        
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}