package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(css = "a.ico-account")
    WebElement _myAccountText;

    public void verifyMyAccountText(String myAccTxt) {
        Reporter.log(" Verify text: " + myAccTxt + " is displayed on the Account Page " + _myAccountText.toString() + "<br>");
        verifyTextAssertMethod(_myAccountText, myAccTxt);
        log.info("Verify text: " + myAccTxt + " is displayed on the Account Page " + _myAccountText.toString());
    }
}
