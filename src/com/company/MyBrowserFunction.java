package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Vitaly on 18.05.2015.
 */

public class MyBrowserFunction {

    public static WebDriver Browser;
    public static WebElement Element;


// ==================================================== Собственно - для тестов ========================================

    public static void OpenBrowser() {
        // Browser running (for starting from IDEA)
         System.setProperty("webdriver.chrome.driver", "C:/Automation/WebDrivers/chromedriver.exe");
        // Browser running (for starting from drone.io)
        //System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        Browser = new ChromeDriver();
        // Browser = new FirefoxDriver();
    }

    public static void CloseBrowser () {
        Browser.close();
    }

    public static void OpenURL() {
        // URL Opening
        Browser.get("http://booking.uz.gov.ua/ru/");
    }

    public static String TitleChecker () {
        return Browser.getTitle();
    }


}
