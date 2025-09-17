package com.kalai.ex_06_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_Alerts {

    @Test
    public void testAlerts() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        /*driver.findElement(By.xpath("//button[@onclick = \"jsAlert()\"]")).click();

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.dismiss();*/

        //driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();

        driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Kalai");
        alert.accept();

        String resultText = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(resultText,"You entered: Kalai");

   }
}
