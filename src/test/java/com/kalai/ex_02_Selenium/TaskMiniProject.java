package com.kalai.ex_02_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskMiniProject {

    @Test
    public void validateminiproject() {
       FirefoxDriver driver = new FirefoxDriver();
       driver.get("https://app.vwo.com/");

        driver.getTitle();
        driver.getCurrentUrl();
        driver.getPageSource();

        driver.findElement(By.linkText("Start a free trial")).click();
        driver.findElement(By.id("page-v1-step1-email")).sendKeys("abc");

        driver.findElement(By.name("gdpr_consent_checkbox")).click();
        driver.findElement(By.tagName("button")).click();

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(), "The email address you entered is incorrect.");

        driver.close();
    }
}
