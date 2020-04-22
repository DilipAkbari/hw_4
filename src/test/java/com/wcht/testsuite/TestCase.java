package com.wcht.testsuite;

import com.wcht.pages.HomePage;
import com.wcht.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase extends TestBase {
    HomePage homePage;

    @BeforeMethod(groups = {"regression", "smoke", "sanity"})
    public void setUp() {
        homePage = new HomePage();
    }

    @Test(groups = {"regression", "smoke"})
    public void varifyScrollDownHomePage() {
        homePage.clickOnDownArrowButton();
        homePage.verifyBetterHomesText();

    }
}

