package com.vit.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.vit.page.navigation.DynamicLoadingPage;
import com.vit.page.navigation.MultipleWindowsPage;
import com.vit.pages.alerts.AlertsPage;
import com.vit.pages.alerts.FileUploadPage;
import com.vit.pages.contextmenu.ContextMenuPage;
import com.vit.pages.dropdown.DropdownPage;
import com.vit.pages.frames.FramesPage;
import com.vit.pages.frames.WysiwygEditorPage;
import com.vit.pages.hover.HoversPage;
import com.vit.pages.javascript.InfiniteScrollPage;
import com.vit.pages.javascript.LargeAndDeepDomPage;
import com.vit.pages.login.LoginPage;
import com.vit.pages.passwords.ForgotPasswordPage;
import com.vit.pages.slider.HorizontalSliderPage;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver){
        this.driver = driver;
    }
	
	public AlertsPage clickJavaScriptAlerts(){
		 clickLink("JavaScript Alerts");
		 return new AlertsPage(driver);
    }

	public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

	public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
       
	public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    
	public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
    
	public HoversPage clickHovers(){
		clickLink("Hovers");
		return new HoversPage(driver);
	 }
    
	 public LargeAndDeepDomPage clickLargeAndDeepDom(){
		 clickLink("Large & Deep DOM");
		 return new LargeAndDeepDomPage(driver);
	    }
    
	 public InfiniteScrollPage clickInfiniteScroll(){
		 clickLink("Infinite Scroll");
		 return new InfiniteScrollPage(driver);
	    }
	 
	 public DynamicLoadingPage clickDynamicLoading(){
	        clickLink("Dynamic Loading");
	        return new DynamicLoadingPage(driver);
	    }
	 
	 public MultipleWindowsPage clickMultipleWindows(){
	        clickLink("Multiple Windows");
	        return new MultipleWindowsPage(driver);
	    }
	 
	 public ForgotPasswordPage clickForgotPassword(){
	        clickLink("Forgot Password");
	        return new ForgotPasswordPage(driver);
	    }
	 
	 public HorizontalSliderPage clickHorizonalSlider(){
	        clickLink("Horizontal Slider");
	        return new HorizontalSliderPage(driver);
	    }
	 
	 public ContextMenuPage clickContextMenu(){
	        clickLink("Context Menu");
	        return new ContextMenuPage(driver);
	    }
	 
	 public FramesPage clickFramesPage(){
	        clickLink("Frames");
	        return new FramesPage(driver);
	    }
	 
	 
	 
	 
	 private void clickLink(String linkText){
		 driver.findElement(By.linkText(linkText)).click();
	  }
} 
	 
	        
	  
        

    
   
    
    
    
   


    



