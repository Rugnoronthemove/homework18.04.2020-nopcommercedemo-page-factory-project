package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @FindBy(xpath = "//div[@class='page-body']//strong[text()='Your Personal Details']")
    WebElement _textYourPersonalDetails;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement _maleGenderRadioBtn;

    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement _femaleGenderRadioBtn;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement _firstNameField;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement _lastNameField;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement _dayDOB;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement _monthDOB;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement _yearDOB;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement _emailField;

    @FindBy(xpath = "//input[@id='Company']")
    WebElement _companyNameField;

    @FindBy(css = "input#Newsletter")
    WebElement _newsletterCheckBox;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement _confirmPasswordField;

    @FindBy(xpath = "//input[@id='register-button']")
    WebElement _registerBtn;

    public void verifyTextYourPersonalDetails(String txt) {
        Reporter.log(" Verify Text: " + txt + " is displayed on the Registeration Page" + _textYourPersonalDetails.toString() + "<br>");
        verifyTextAssertMethod(_textYourPersonalDetails, txt);
        log.info(" Verify Text: " + txt + " is displayed on the Registeration Page" + _textYourPersonalDetails.toString());
    }

    public void selectMaleGenderRadioBtn() {
        Reporter.log(" Select Gender Male " + _maleGenderRadioBtn.toString() + "<br>");
        waitUntilElementToBeClickable(_maleGenderRadioBtn,20);
        radioButtonClick(_maleGenderRadioBtn);
        log.info(" Select Gender Male " + _maleGenderRadioBtn.toString());
    }

    public void selectFemaleGenderRadioBtn() {
        Reporter.log(" Select Gender Male " + _maleGenderRadioBtn.toString() + "<br>");
        waitUntilElementToBeClickable(_femaleGenderRadioBtn,20);
        radioButtonClick(_femaleGenderRadioBtn);
        log.info(" Select Gender Male " + _femaleGenderRadioBtn.toString());
    }

    public void sendTextToFirstNameField(String fName) {
        Reporter.log(" Send text: " + fName + " to First Name field " + _firstNameField.toString() + "<br>");
        waitUntilElementToBeClickable(_firstNameField,20);
        sendTextToElement(_firstNameField, fName);
        log.info(" Send text: " + fName + " to First Name field " + _firstNameField.toString());
    }

    public void sendTextToLastNameField(String lName) {
        Reporter.log(" Send text: " + lName + " to Last Name field " + _lastNameField.toString() + "<br>");
        waitUntilElementToBeClickable(_lastNameField,20);
        sendTextToElement(_lastNameField, lName);
        log.info(" Send text: " + lName + " to Last Name field " + _lastNameField.toString());
    }

    public void selectDayDOBFromDropDownMenu(String date) {
        Reporter.log(" Select date of DOB from the drop down menu: " + _dayDOB.toString() + "<br>");
        waitUntilElementToBeClickable(_dayDOB,20);
        selectByVisibleTextFromDropDown(_dayDOB, date);
        log.info(" Select date of DOB from the drop down menu: " + _dayDOB.toString());
    }

    public void selectMonthDOBFromDropDownMenu(String mnth) {
        Reporter.log(" Select month of DOB from the drop down menu:" + _monthDOB.toString()+ "<br>");
        waitUntilElementToBeClickable(_monthDOB,20);
        selectByVisibleTextFromDropDown(_monthDOB, mnth);
        log.info(" Select month of DOB from the drop down menu:" + _monthDOB.toString());
    }

    public void selectYearDOBFromDropDownMenu(String yr) {
        Reporter.log(" Select year of DOB from drop down menu:" +_yearDOB.toString() +"<br>");
        waitUntilElementToBeClickable(_yearDOB,20);
        selectByVisibleTextFromDropDown(_yearDOB, yr);
        log.info(" Select year of DOB from drop down menu:" +_yearDOB.toString());
    }

    public void sendTextToEmailField(String emailId) {
        Reporter.log(" Send text: "+emailId+" to email field "+_emailField.toString()+"<br>");
        waitUntilElementToBeClickable(_emailField,20);
        sendTextToElement(_emailField, emailId);
        log.info(" Send text: "+emailId+" to email field "+_emailField.toString());
    }

    public void sendTextToCompanyNameField(String coName) {
        Reporter.log(" Send text: "+coName+" to company name field "+_companyNameField.toString()+ "<br>");
        waitUntilElementToBeClickable(_companyNameField,20);
        sendTextToElement(_companyNameField, coName);
        log.info(" Send text: "+coName+" to company name field "+_companyNameField.toString());
    }

    public void selectNewsLetterCheckBox() {
        Reporter.log(" Check if newsletter checkbox ticked "+_newsletterCheckBox.toString()+"<br>");
        waitUntilElementToBeClickable(_newsletterCheckBox,20);
        elementIsSelected(_newsletterCheckBox);
        log.info(" Check if newsletter checkbox ticked "+_newsletterCheckBox.toString());
    }

    public void sendTextToPasswordField(String pwd) {
        Reporter.log(" Send text: "+pwd+ " to password field " +_passwordField.toString() +"<br>");
        waitUntilElementToBeClickable(_passwordField,20);
        sendTextToElement(_passwordField, pwd);
        log.info(" Send text: "+pwd+ " to password field " +_passwordField.toString());
    }

    public void sendTextToConfirmPasswordField(String coPwd) {
        Reporter.log(" Send text: "+coPwd+ " to confirm password field " +_confirmPasswordField.toString() +"<br>");
        waitUntilElementToBeClickable(_confirmPasswordField,20);
        sendTextToElement(_confirmPasswordField, coPwd);
        log.info(" Send text: "+coPwd+ " to confirm password field " +_confirmPasswordField.toString());
    }

    public void clickOnRegisterButton() {
        Reporter.log(" Click on Register button "+_registerBtn.toString()+"<br>");
        waitUntilElementToBeClickable(_registerBtn,20);
        clickOnElement(_registerBtn);
        log.info(" Click on Register button "+_registerBtn.toString());
    }
}

