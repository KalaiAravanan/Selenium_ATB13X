package com.kalai.ex_02_Selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium_03{

    @Test
    public void testdriver(){
        FirefoxDriver driver  = new FirefoxDriver();
        driver.get("https://www.yahoo.com");
    }
}