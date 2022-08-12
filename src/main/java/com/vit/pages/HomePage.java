package com.vit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    
   
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    
    
   
}

    



