package com.kalai.ex_17_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab_47_DDT_Testng_POI {

    @Test(dataProvider = "getData")
    public void test_VWOLogin(String email, String password, String ExpectedResult) {
        System.out.println("Running...");
        System.out.println(email+ " | " +password+ " | " +ExpectedResult);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                new Object[]{"admin@gmail.com", "pass123", "Expected Result - 1"},
                new Object[]{"admin123@gmail.com", "password123", "Expected Result - 2"},
                new Object[]{"admin098@gmail.com", "123@pass", "Expected Result - 3"}
        };
    }

}
