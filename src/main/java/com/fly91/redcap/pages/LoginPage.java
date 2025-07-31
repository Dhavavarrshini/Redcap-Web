package com.fly91.redcap.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {
   private Page page;


    private final String usernameField = "input[placeholder='Email or Employee ID']";
    private final String passwordField = "input[placeholder='Password']";
    private final String signinButton = "button:has-text('Sign In')";

    /*private final String username = "LnTtester@gmail.com";
    private final String password = "lnttester@gmail.com";*/

    private final String username = "admin@fly91.in";
    private final String password = "FLY91@Avsec";

    public LoginPage(Page page) {
        this.page = page;
    }


    public void enterUsername() {
       // page.locator(usernameField).waitFor(new Locator.WaitForOptions().setTimeout(50000));
        page.locator(usernameField).click();
        page.locator(usernameField).fill(username);
    }

    public void enterPassword() {
        page.locator(passwordField).click();
        page.locator(passwordField).fill(password);
    }

    public void clickLogin() {
        page.locator(signinButton).click();
    }

    // Main login method
    public void doLogin() {
        enterUsername();
        enterPassword();
        clickLogin();
    }
}