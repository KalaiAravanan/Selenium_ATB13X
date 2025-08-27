package com.kalai.ex_02_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_Maximize_Minimize {

    @Test
    public void fnmaxmin(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https:www.yahoo.com");
        driver.manage().window().maximize();
        //driver.manage().window().minimize();
    }
}
