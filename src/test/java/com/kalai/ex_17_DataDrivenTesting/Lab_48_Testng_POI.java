package com.kalai.ex_17_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab_48_Testng_POI {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String username, String password, String ER) {
        System.out.println("Running  ");
        System.out.println(username + " - " + password + " - " + ER);
        System.out.println();
    }

    @DataProvider
    public Object[][] getData() {
        // Read from the excel file
        // convert this into the 2d array Object
        // return that array
        return null;
    }
}
