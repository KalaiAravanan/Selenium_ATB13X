package com.kalai.ex_10_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class TestSelenium_32_ActionClass {
    @Test
    public void testAction(){

        WebDriver driver = new ChromeDriver();
        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement from_input = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions = new Actions(driver);
        // move to element
        // click
        // sendkeys -BLR

        WebElement destination = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));

        actions.moveToElement(from_input).click().sendKeys("BLR").build().perform();
        actions.moveToElement(destination).click().sendKeys("DEL").build().perform();

        driver.quit();
    }
}
