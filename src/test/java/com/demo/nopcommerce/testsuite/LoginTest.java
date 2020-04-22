package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.AccountPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.resources.testdata.TestData;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    AccountPage accountPage;

    //Object created for pages
    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        accountPage = new AccountPage();
    }

    /*
     * Test case 01
     *  User should navigate to log in page successfully
     */
    @Test(groups = {"Regression","Smoke","Sanity"})
    public void userShouldNavigateToLoginPageSuccessfully() {
        //click on Login Link
        homePage.clickOnLoginLink();
        //verify welcome text on login page
        loginPage.verifyWelcomeText("Welcome, Please Sign In!");
    }

    /*
     * Test case 02
     * User should log in successfully using valid credentials
     */
    @Test (groups = {"Regression","Smoke"}, dataProvider = "LoginCredentials",dataProviderClass = TestData.class)
    public void userShouldLoginSuccessfully(String username, String password) {
        //click on Login link
        homePage.clickOnLoginLink();
        //do login to the application
        loginPage.loginToApplication(username,password);
        //verify text My Account
        accountPage.verifyMyAccountText("My account");
    }

    /*
    * Test 03
    */
    @Test(groups = {"Regression"})
    public void verifyUserShouldNotNavigateToLoginPage(){
        //click on Register link
        homePage.clickOnRegisterLink();
        //verify homepage text
        loginPage.verifyWelcomeText("Welcome, Please Sign In!");
    }

}
