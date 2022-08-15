package com.vit.pages.javascript;

import com.vit.utils.base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
        
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
