package com.kalai.ex_03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium18_Link_PartialLink_Text {
    @Test
    public void testpartiallink(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        WebElement element = driver.findElement(By.partialLinkText("Start"));
        //WebElement element = driver.findElement(By.linkText("Start a free trial"));
        element.click();
        String url = driver.getCurrentUrl();
        System.out.println("URL:" +url);
        //Assert.assertEquals("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage",url);
        driver.quit();
    }

}
