package com.bridgelabz.selenium.browserstacktool.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStack {

    public static WebDriver driver = null;
    public static final String USERNAME = "prahladprajapati_4PszNm";
    public static final String AUTOMATE_KEY = "9ipnojx6EgXs4EmVanEM";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability ("browser", "chrome");
        caps.setCapability ("browser_version", "91.0");

        caps.setCapability ("os", "Windows");
        caps.setCapability ("os_version", "10");

        caps.setCapability ("build", "browserstack-build-1");
        driver = new RemoteWebDriver (new URL (URL),caps);
    }
}
