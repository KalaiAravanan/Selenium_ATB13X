package com.kalai.ex_11_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium_36_FileUploadBS {
    public static void main(String[] args) {

       // new WaitHelpers().waitJVM(5000);

        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.browserstack.com/users/sign_in");
//        driver.manage().window().maximize();


        // new WaitHelpers().waitJVM(5000);

        driver.get("https://app-automate.browserstack.com/utilities/app_management");

        //new WaitHelpers().waitJVM(2000);

        WebElement uploadFileInput = driver.findElement(By.id("file-upload"));
        String user_dir = System.getProperty("user.dir");
        // /Users/promode/IdeaProjects/LearningSeleniumATB12x
        System.out.println(user_dir);
        String path = user_dir + "/src/test/java/com/thetestingacademy/ex11_File_Upload/testdroid-sample-app.apk";

        uploadFileInput.sendKeys(path);
    }
}
