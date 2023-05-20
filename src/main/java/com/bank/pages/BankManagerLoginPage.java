package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {
    // Declaring Logger variable to instate the log.info statement in every method
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    // Storing Bank manager login button locator
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLogin;

    public void clickOnBankManagerButton() { // Method to click on Bank Manager Login button
        clickOnElement(bankManagerLogin);
        log.info("Clicking On Bank Manager Login Button : " + bankManagerLogin.toString());
    }
}
