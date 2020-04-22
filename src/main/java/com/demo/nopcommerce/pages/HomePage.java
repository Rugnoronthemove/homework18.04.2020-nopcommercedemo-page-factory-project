package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(css = "a.ico-login")
    WebElement _loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement _registerLink;

    public void clickOnLoginLink() {
        Reporter.log(" Clicking on login link: " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on login link: " + _loginLink.toString());
    }

    public void clickOnRegisterLink() {
        Reporter.log("CLicking on register link: "+ _registerLink.toString()+ "<br>");
        clickOnElement(_registerLink);
        log.info("Clicking on register link: " + _registerLink.toString());
    }


}
