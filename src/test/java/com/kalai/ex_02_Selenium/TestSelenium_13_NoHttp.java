package com.kalai.ex_02_Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium_13_NoHttp {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
//      driver.get("bing.com"); // HTTPs is important. this url will not work
        driver.get("https://bing.com"); // HTTPs is important.
        driver.quit();
    }
}
