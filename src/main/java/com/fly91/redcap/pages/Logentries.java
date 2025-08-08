package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class Logentries {
    private Page page;

    private final String logentries = "(//p[contains(text(), 'Log Entries')])[2]";
    private final String viewLogentry = "(//td[contains(text(), 'PNQ')])[1]";
    private final String viewoperationalEntry = "//span[contains(text(), 'Operational')]";
    private final String viewBack = "//span[contains(text(), 'Back')]";

    private final String Edit = "(//span[contains(@class, 'm_8d3afb97 mantine-ActionIcon-icon')])[2]";
    private final String EditFlightType = "//div[contains(@class, 'm_1b7284a3 mantine-Paper-root')]";
    private final String NoChangeButton = "//input[contains(@class, 'mantine-focus-auto m_26063560 mantine-Checkbox-input')]";
    private final String EditLastPaxOnboard =  "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[22]";
    private final String FlightType = "(//div[contains(@class, 'css-19bb58m')])[3]";
    private final String DelayTime = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
    private final String DelayGroup = "(//div[contains(@class, 'css-19bb58m')])[4]";
    private final String DelayCode = "(//div[contains(@class, 'css-19bb58m')])[5]";
    private final String DelayReason = "(//textarea[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-Textarea-input')])[1]";
    private final String DelayTime2 = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
    private final String DelayGroup2 = "(//div[contains(@class, 'css-19bb58m')])[6]";
    private final String DelayCode2 = "(//div[contains(@class, 'css-19bb58m')])[7]";
    private final String DelayReason2 = "(//textarea[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-Textarea-input')])[2]";
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
        page.locator(NoChangeButton).click();
        page.locator(FlightType).click();
        page.locator(FlightType).type("Ferry");
        page.locator(FlightType).press("Enter");
        Thread.sleep(10000);
        page.locator(DelayTime).click();
        Thread.sleep(10000);
        page.locator(DelayGroup).click();
        page.locator(DelayGroup).type("AIRPORT");
        page.locator(DelayGroup).press("Enter");
        Thread.sleep(10000);
        page.locator(DelayCode).click();
        page.locator(DelayCode).type("96RV");
        page.locator(DelayCode).press("Enter");
        Thread.sleep(10000);
        page.locator(DelayReason).click();
        page.locator(DelayReason).fill("Automation Test");
        page.locator(DelayTime2).click();
        Thread.sleep(10000);
        page.locator(DelayGroup2).click();
        page.locator(DelayGroup2).type("OPERATIONS");
        page.locator(DelayGroup2).press("Enter");
        Thread.sleep(10000);
        page.locator(DelayCode2).click();
        page.locator(DelayCode2).type("99DO");
        page.locator(DelayCode2).press("Enter");
        Thread.sleep(10000);
        page.locator(DelayReason2).click();
        page.locator(DelayReason2).fill("Automation practice");
    //    page.locator(EditLastPaxOnboard).fill("10:00");
        Thread.sleep(10000);
        /*page.locator(Updatebutton).click();
        Thread.sleep(10000);
        page.locator(Confirmbutton).click();*/




    }

    public void doLogentries() throws InterruptedException {
        Logentries();
    }
}

