package com.kalai.ex_03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_17_ProjectLocators {
    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Pramod Dutta")
    @Test
    public void test_vwo_login_invalid_login() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

        // Maximize the window
//        driver.manage().window().maximize();


        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // <input open Tag
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // data-gtm-form-interact-field-id="0"
        // > close Tag

        driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("admin@admin.com");
        driver.findElement(By.xpath("//input[@id=\"login-password\"]")).sendKeys("1234");

        driver.findElement(By.xpath("//button[@id=\"js-login-btn\"]")).click();

        // Step 4 - Wait some time. this steps will make the JVM to wait
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        // Step 6, we have added the TestNG assertion to verify.
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");



    }
}
