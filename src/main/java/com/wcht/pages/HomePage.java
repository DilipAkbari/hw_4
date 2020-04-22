package com.wcht.pages;

import com.wcht.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    //list of elements and their locations
    //  By downArrowButton = By.xpath("//button[@class='home-carousel__down-arrow js-to-content']");
    //   By betterHomesText = By.xpath("//div[@class='grid-column']//h1");
    @FindBy(xpath = "//button[@class='home-carousel__down-arrow js-to-content']")
    WebElement _downArrowButton;

    @FindBy(xpath = "//div[@class='grid-column']//h1")
    WebElement _betterHomeTest;

    //methods performing actions on elements
    public void clickOnDownArrowButton() {
        Reporter.log("clicking on down arrow" + _downArrowButton + "<br>");
        clickOnElement(_downArrowButton);
        log.info("clicking on down arrow" + _downArrowButton);
    }

    public void verifyBetterHomesText() {
        Reporter.log("Varify better home Text" + _betterHomeTest + "<br>");
        verifyTextAssertMethod(_betterHomeTest, "Better homes, friendlier communities – together");
        log.info("Varify better home Text" + _betterHomeTest);
    }

}
