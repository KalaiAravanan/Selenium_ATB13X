package com.kalai.ex_02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium_11_ChangeDriver {

    @Test
    public void fnchangedriver(){
       WebDriver driver = new ChromeDriver();
       driver = new FirefoxDriver();


    }
}
