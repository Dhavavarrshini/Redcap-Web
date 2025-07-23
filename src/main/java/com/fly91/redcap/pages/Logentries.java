package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class Logentries {
    private Page page;

    private final String logentries = "(//p[contains(text(), 'Log Entries')])[2]";
    private final String viewLogentry = "(//td[contains(text(), 'PNQ')])[1]";
    private final String viewoperationalEntry = "//span[contains(text(), 'Operational')]";
    private final String viewBack = "//span[contains(text(), 'Back')]";
    private final String Edit = "(//span[contains(@class, 'm_8d3afb97 mantine-ActionIcon-icon')])[1]";
    private final String EditLastPaxOnboard =  "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[22]";
    private final String Updatebutton = "//span[contains(text(), 'Update')]";
    private final String Confirmbutton = "//span[contains(text(), 'Confirm')]";




    public Logentries(Page page) {
        this.page = page;
    }

    public void Logentries() throws InterruptedException {

        page.locator(logentries).click();
        page.locator(viewLogentry).click();
        page.locator(viewoperationalEntry).click();
        Thread.sleep(10000);
        page.locator(viewBack).click();
        Thread.sleep(10000);
        page.locator(Edit).click();
        Thread.sleep(10000);
        page.locator(EditLastPaxOnboard).fill("10:00");
        Thread.sleep(10000);
        page.locator(Updatebutton).click();
        Thread.sleep(10000);
        page.locator(Confirmbutton).click();




    }

    public void doLogentries() throws InterruptedException {
        Logentries();
    }
}

