package com.kalai.ex_08_SVG_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.List;

public class TestSelenium_30_SVG {

    @Test
    public void testSVG() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        //driver.findElement(By.xpath("//button[@onclick = \"jsAlert()\"]")).click();

        driver.findElement(By.name("q")).sendKeys("mac mini");
        driver.findElement(By.xpath("//*[name() = \"svg\"]")).click();

        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));

        for (WebElement title : titlesResults) {
            System.out.println(title.getText());
        }


        // until Next button is visible, for loop
        WebElement next_button = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
        while (next_button.isDisplayed()) {

            WebElement next_button_page2 = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
            next_button_page2.click();


            List<WebElement> titlesResults2 = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));

            for (WebElement title : titlesResults2) {
                if (title.getText() != null) {
                    System.out.println(title.getText());
                }
            }


        }
    }
}

