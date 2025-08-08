package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class Profile {
    private Page page;

    private final String Profile     = "//span[contains(@class,'m_104cd71f mantine-Avatar-placeholder')]";
    private final String ViewProfile = "//div[contains(text(),'View Profile')]";
    private final String FirstName   = "(//input[contains(@class,'m_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[1]";
    private final String LastName    = "(//input[contains(@class,'m_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[2]";
    private final String UpdateInfo  = "//span[contains(text(),'Update Information')]";

    private final String OldPassword     = "(//input[contains(@class,'m_f2d85dd2 mantine-PasswordInput-innerInput')])[1]";
    private final String ViewOldPassword = "(//span[contains(@class,'m_8d3afb97 mantine-ActionIcon-icon')])[1]";
    private final String NewPassword     = "(//input[contains(@class,'m_f2d85dd2 mantine-PasswordInput-innerInput')])[2]";
    private final String ViewNewPassword = "(//span[contains(@class,'m_8d3afb97 mantine-ActionIcon-icon')])[2]";
    private final String ConfirmPassword = "(//input[contains(@class,'m_f2d85dd2 mantine-PasswordInput-innerInput')])[3]";
    private final String ViewConfirmPassword = "(//span[contains(@class,'m_8d3afb97 mantine-ActionIcon-icon')])[3]";
    private final String UpdatePassword  = "//span[contains(text(),'Update Password')]";









    public Profile(Page page) {
        this.page = page;
    }
    public void Profile() throws InterruptedException {
        page.locator(Profile).click();
        page.locator(ViewProfile).click();
        page.locator(FirstName).click();
        page.locator(FirstName).clear();
        page.locator(FirstName).type("Redcap Admin");
        page.locator(LastName).click();
        page.locator(LastName).clear();
        page.locator(LastName).type("Redcap Admin");
        Thread.sleep(10000);
        page.locator(UpdateInfo).hover();
        Thread.sleep(10000);

        page.locator(OldPassword).click();
        page.locator(OldPassword).fill("FLY91@Avsec");
        page.locator(ViewOldPassword).click();
        page.locator(NewPassword).click();
        page.locator(NewPassword).fill("Testing Nitish");
        page.locator(ViewNewPassword).click();
        page.locator(ConfirmPassword).click();
        page.locator(ConfirmPassword).fill("Testing Nitish");
        page.locator(ViewConfirmPassword).click();
        page.locator(UpdatePassword).hover();
        Thread.sleep(10000);





    }
    public void doProfile() throws InterruptedException {
        Profile();
    }

}
