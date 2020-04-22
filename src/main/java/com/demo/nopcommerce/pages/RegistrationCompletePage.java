package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import com.google.inject.internal.cglib.core.$CodeGenerationException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegistrationCompletePage extends Utility {

    private static final Logger log = LogManager.getLogger(RegistrationCompletePage.class.getName());

    @FindBy(xpath = "//div[@class='master-wrapper-content']//div[text()='Your registration completed']")
    WebElement _yourRegistrationCompletedText;

    public void verifyRegistrationCompleteText(String regCompleteTxt) {
        Reporter.log(" Verify text: " + regCompleteTxt + " is displayed on registration completion " + _yourRegistrationCompletedText.toString() + "<br>");
        verifyTextAssertMethod(_yourRegistrationCompletedText, regCompleteTxt);
        log.info(" Verify text: " + regCompleteTxt + " is displayed on registration completion " + _yourRegistrationCompletedText.toString());
    }

}
