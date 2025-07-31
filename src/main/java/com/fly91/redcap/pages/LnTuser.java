package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class LnTuser {
    private Page page;

    private final String StationSelect = "(//div[contains(@class, 'css-19bb58m')])[1]";
    private final String StationFill = "(//input['react-select-2-input'])[1]";
    private final String Date = "//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-DateInput-input')]";
    private final String FlightNumber = "(//div[contains(@class, 'css-1cce186-control')])[2]";
    private final String FlightNumberFill = "(//input['react-select-3-input'])[4]";
    private final String Nextbutton = "//span[contains(text(), 'Next (Preview Latest File)')]";
    private final String PrintButton = "//span[contains(text(), 'Print PDF')]";
    private final String DownloadPDF = "//span[contains(text(), 'Download PDF')]";
    private final String Profileclick = "//p[contains(text(), 'lnt')]";
    private final String ViewProfile = "//div[contains(text(), 'View Profile')]";
    private final String Logout = "//div[contains(text(), 'Logout')]";














    public LnTuser(Page page) {
        this.page = page;
    }
    public void LnTuser() throws InterruptedException {

        page.locator(StationSelect).click();
        page.locator(StationFill).type("SDW");
        page.locator(StationSelect).press("Enter");
        Thread.sleep(10000);
        page.locator(Date).click();
        page.locator(Date).fill("22-Jul-2025");
        page.locator(FlightNumber).click();
        page.locator(FlightNumberFill).type("5607");
        page.locator(FlightNumberFill).press("Enter");
        Thread.sleep(10000);
        page.locator(Nextbutton).click();
        Thread.sleep(10000);
    //   page.locator(PrintButton).click();
    //    page.locator(DownloadPDF).click();
        page.goBack();
        Thread.sleep(10000);
        page.locator(Profileclick).click();
        page.locator(ViewProfile).click();
        Thread.sleep(10000);
        page.goBack();
        page.locator(Profileclick).click();
        page.locator(Logout).click();
        Thread.sleep(10000);





    }


    public void doLnTuser() throws InterruptedException {
        LnTuser();
    }
}
