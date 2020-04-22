package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.pages.RegistrationCompletePage;
import com.demo.nopcommerce.resources.testdata.TestData;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.demo.nopcommerce.utility.Utility.getRandomString;

public class RegisterTest extends TestBase {

    static String email = null;

    HomePage homePage;
    RegisterPage registerPage;
    RegistrationCompletePage registrationCompletePage;

    //Object created for pages
    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
        registrationCompletePage = new RegistrationCompletePage();
    }

    //getRandomString method generates a random value for email every time the test case runs
    @BeforeTest(groups = {"Regression", "Smoke", "Sanity"})
    public static void registrationSetUp() {
        email = "xyz" + getRandomString(2) + "@gmail.com";
    }

    /*
     * Test Case 1 - User should navigate to register page successfully.
     */
    @Test(groups = {"Regression", "Smoke", "Sanity"})
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //click on Register link on HomePage
        homePage.clickOnRegisterLink();
        //Assert text on RegistrationPage
        registerPage.verifyTextYourPersonalDetails("Your Personal Details");
    }

    /*
     * Test Case 2 - User should register successfully.
     */
    @Test(groups = {"Regression", "Smoke"}, dataProvider = "RegisterDetails", dataProviderClass = TestData.class)
    public void userShouldRegisterSuccessfullyAndLoginUsingSameCredentials(String fName, String lName, String date, String month, String year, String coName, String password) {
        //click on Register link on HomePage
        homePage.clickOnRegisterLink();
        //select Male gender radio button
        registerPage.selectMaleGenderRadioBtn();
        //select Female gender radio button
        //registerPage.selectFemaleGenderRadioBtn();
        //send text to First Name field
        registerPage.sendTextToFirstNameField(fName);
        //send text to Last Name field
        registerPage.sendTextToLastNameField(lName);
        //select day from DOB drop down menu
        registerPage.selectDayDOBFromDropDownMenu(date);
        //select month from DOB drop down menu
        registerPage.selectMonthDOBFromDropDownMenu(month);
        //select year from DOB drop down menu
        registerPage.selectYearDOBFromDropDownMenu(year);
        //send text to Email field
        registerPage.sendTextToEmailField(email);
        //send text to Company name field
        registerPage.sendTextToCompanyNameField(coName);
        //check Newsletter checkbox is selected
        registerPage.selectNewsLetterCheckBox();
        //send text to Password field
        registerPage.sendTextToPasswordField(password);
        //send text to Confirm password field
        registerPage.sendTextToConfirmPasswordField(password);
        //click Register button
        registerPage.clickOnRegisterButton();
        //Assert text Registration complete page
        registrationCompletePage.verifyRegistrationCompleteText("Your registration completed");
    }


    /*
     * Test Case 3 - User should navigate to register page successfully.
     */
    @Test(groups = {"Regression"})
    public void userShouldNotNavigateToRegisterPageSuccessfully() {
        //click on Login link on HomePage
        homePage.clickOnLoginLink();
        //Assert text on RegistrationPage
        registerPage.verifyTextYourPersonalDetails("Your Personal Details");
    }

}
