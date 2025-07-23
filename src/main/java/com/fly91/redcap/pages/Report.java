package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class Report {
    private Page page;


    private final String Report = "//p[contains(text(), 'Reports')]";
    private final String DelayReportClick = "//p[contains(text(), 'Delay Report')]";
    private final String Search = "//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')]";
    private final String Download = "//span[contains(text(), 'Download')]";
    private final String OTPreportClick = "//p[contains(text(), 'OTP Report ( monthly )')]";
    private final String SearchOTPreport = "//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')]";









    public Report(Page page) {
        this.page = page;
    }
    public void Report() throws InterruptedException {


        page.locator(Report).click();
        Thread.sleep(10000);
        page.locator(DelayReportClick).click();
        Thread.sleep(10000);
        page.locator(Search).click();
        page.locator(Search).type("5904");
        Thread.sleep(10000);
    //    page.locator(Download).click();
        page.locator(Download).hover();
        Thread.sleep(10000);
        page.goBack();
        page.locator(OTPreportClick).click();
        page.locator(SearchOTPreport).click();
        page.locator(SearchOTPreport).fill("5904");
        Thread.sleep(10000);

    }





    public void doReport() throws InterruptedException {
        Report();
    }
}
