package com.ccm.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class OpenBrowser {
	
	public static WebDriver openBrowser(String browser) {
        WebDriver driver = null;
        if (browser == null || browser.equals("")) {
            return null;
        } else if (browser.equals("chrome")) {
            // chrome浏览器
        	
        	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equals("ie")) {
            // ie
            System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
            driver = new InternetExplorerDriver();

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }


    public static void closeBrowser(WebDriver driver){
        driver.close();
        driver.quit();
    }

}
