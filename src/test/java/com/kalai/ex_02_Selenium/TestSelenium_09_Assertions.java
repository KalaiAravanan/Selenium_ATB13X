package com.kalai.ex_02_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_09_Assertions {
    @Test
    public void fnmassertions() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.yahoo.com");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.yahoo.com/");
    }
}