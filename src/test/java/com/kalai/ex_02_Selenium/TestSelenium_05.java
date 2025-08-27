package com.kalai.ex_02_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_05 {
    @Test
    public void testfn(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.msn.com");
    }
}
