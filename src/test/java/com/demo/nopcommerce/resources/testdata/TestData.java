package com.demo.nopcommerce.resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "LoginCredentials")
    //method returning two dimensional object
    public Object[][] getLoginData() {

        //creating object for the two dimensional Object[][]
        return new Object[][]{

                //adding data set to the two dimensional Object[][]
                {"xyz13@gmail.com", "abc123"},
                {"abc@gmail.com", "abc123"}
        };
    }

    @DataProvider(name = "RegisterDetails")
    //method returning two dimensional object
    public Object[][] getRegisterData() {

        //creating object for the two dimensional Object[][]
        return new Object[][]{

                //adding data set to the two dimensional Object[][]
                {"Prime", "Testing", "5", "May", "2014","Square1", "abc123"}
        };
    }

}
