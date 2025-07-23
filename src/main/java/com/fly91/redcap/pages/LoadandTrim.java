package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class LoadandTrim {
    private Page page;

    private final String LnT = "//p[contains(text(), 'Load and Trim')]";
//  private final String OpenLnT = "(//td[contains(@class, 'm_4e7aa4ef mantine-Table-td')])[2]";
    private final String OpenLnT = "//*[@id=\"root\"]/div/div/main/div[2]/div/div[1]/div/div[1]/div/div/table/tbody/tr[1]/td[2]";
    private final String OpenLnTPDF = "(//p[contains(@class, 'mantine-focus-auto m_b6d8b162 mantine-Text-root')])[31]";
    private final String Close = "//span[contains(text(), 'Close')]";
    private final String FilterbyDate = "(//span[contains(@class, 'm_8d3afb97 mantine-ActionIcon-icon')])[1]";
    private final String FromDate = "//input[contains(@placeholder, 'Filter by from date')]";
    private final String ToDate = "//input[contains(@placeholder, 'Filter by to date')]";
    private final String Search = "//input[contains(@placeholder, 'Search by station, flight number, or sector')]";








    public LoadandTrim(Page page) {
        this.page = page;
    }

    public void LoadandTrim() throws InterruptedException {
        page.locator(LnT).click();
        page.locator(OpenLnT).click();
        Thread.sleep(10000);
        //page.locator(OpenLnTPDF).click();
        Thread.sleep(10000);
        page.locator(Close).click();
        Thread.sleep(10000);
        page.locator(FilterbyDate).click();
        page.locator(FromDate).fill("July 8 2025");
        page.locator(FromDate).press("Enter");
        page.locator(ToDate).fill("July 22 2025");
        page.locator(ToDate).press("Enter");
        Thread.sleep(10000);
        page.locator(FromDate).clear();
        page.locator(ToDate).clear();
        page.locator(Search).fill("IC 5601");
        Thread.sleep(10000);





    }
    public void doLoadandTrim() throws InterruptedException {
        LoadandTrim();
    }
}
