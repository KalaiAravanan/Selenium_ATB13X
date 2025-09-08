package com.kalai.ex_06_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_26_Radio_Checkbox {

    @Test
    public void testwebpage(){

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://awesomeqa.com/practice.html");
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/practice.html");

        //input[@name="firstname"]
        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Kalai");

        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Aravanan");

        driver.findElement(By.xpath("//input[@id=\"sex-1\"]")).click();

        driver.findElement(By.xpath("//input[@id=\"profession-1\"]")).click();

        //driver.quit();
    }
}
