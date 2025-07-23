package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class ManageUser {
    private Page page;


     private final String manageuser = "//p[contains(text(), 'Manage User')]";
     private final String adduser = "//span[contains(text(), 'Add User')]";
     private final String firstname = "input[placeholder='Enter first name']";
     private final String lastname = "input[placeholder='Enter last name']";
     private final String email = "input[placeholder='Enter email address']";
     private final String employeeID = "input[placeholder='Enter employee ID']";
     private final String password = "input[placeholder='Enter password']";
     private final String UserType = "//div[contains(@class, 'css-hlgwow')]";
     private final String cancel = "text=Cancel";
     private final String submit = "text=Submit";
     private final String status = "(//span[contains(@class, 'm_8277e082 mantine-Switch-trackLabel')])[5]";
     private final String edit = "(//span[contains(@class, 'm_8d3afb97 mantine-ActionIcon-icon')])[4]";
     private final String editDetails = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[2]";
     private final String SubmitEdit = "text=Submit";
     private final String navigation = "(//span[contains(@class, 'm_8d3afb97 mantine-ActionIcon-icon')])[13]";



public ManageUser (Page page) {
    this.page = page;
}

public void UserCreation() throws InterruptedException {
    Thread.sleep(10000);
    page.locator(manageuser).click();
    page.locator(adduser).click();
    Thread.sleep(10000);

    page.locator(firstname).fill("Test1");
    page.locator(lastname).fill("Test2");
    page.locator(email).fill("test@gmail.com");
    page.locator(employeeID).fill("EMP123");
    page.locator(password).fill("Redcap@1234");
    page.locator(UserType).click();
    page.locator(UserType).press("ArrowDown");
    page.locator(UserType).press("Enter");
    Thread.sleep(10000);
    page.locator(cancel).click();
    //page.locator(submit).click();
    Thread.sleep(10000);
    page.locator(status).click();
    page.locator(edit).click();
    page.locator(editDetails).clear();
    page.locator(editDetails).fill("Dhava");
    page.locator(SubmitEdit).click();
    Thread.sleep(10000);
    page.locator(navigation).click();
    Thread.sleep(10000);



}

    public void doManageUer() throws InterruptedException {
        UserCreation();
    }
}
