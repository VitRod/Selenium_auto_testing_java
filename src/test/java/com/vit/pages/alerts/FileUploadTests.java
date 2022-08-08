package com.vit.pages.alerts;

import com.vit.utils.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
	
	@Test
    public void testFileUpload(){
		var uploadPage = homePage.clickFileUpload();
// It is needed to add absolute path
        uploadPage.uploadFile("H:\\SpringToolSuite4_of_2022\\Workspace2022SpringBootHibernate\\Selenium_auto_testing_java\\src\\main\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
	}

     
}  