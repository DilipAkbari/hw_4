package com.wcht.browserselector;

import com.wcht.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.logging.Logger;

public class BrowserSelector extends BasePage {
    public String projectpath = System.getProperty("user.dir");
    private static final Logger log = Logger.getLogger(BrowserSelector.class.getName());

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", projectpath + "/driver/chromedriver.exe");
            driver = new ChromeDriver();
            log.info("chrome browser selected");

        } else if (browser.equalsIgnoreCase("firefox")) {

            System.getProperty("webdriver.gecko.driver", projectpath + "/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {

            System.getProperty("webdriver.ie.driver", projectpath + "/driver/IEDriverServer.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong browser name");
        }


    }


}
