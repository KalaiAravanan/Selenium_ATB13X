package com.kalai.ex_06_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_29_Modal {

    @Test
    public void testModal() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://makemytrip.com/");

        // Step 4 - Wait some time. this steps will make the JVM to wait
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();



    }

}