package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class Report {
    private Page page;


    private final String Report = "//p[contains(text(), 'Reports')]";
    private final String DelayReportClick = "//p[contains(text(), 'Delay Report')]";
    private final String Search = "//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')]";
    private final String Download = "//span[contains(text(), 'Download')]";
    private final String DelayFilter = "(//span[contains(@class, 'm_8d3afb97 mantine-ActionIcon-icon')])[1]";
    private final String DelayFilterFrom = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-DateInput-input')])[1]";
    private final String DelayFilterTo = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-DateInput-input')])[2]";

    private final String OTPreportClick = "//p[contains(text(), 'OTP Report ( monthly )')]";
    private final String SearchOTPreport = "//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')]";

    private final String MISreport = "//p[contains(text(), 'Ground Ops MIS Report')]";
    private final String SearchMISreport = "//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')]";
    private final String DownloadMISreport = "//span[contains(text(), 'Download')]";

    private final String DGCAreport = "//p[contains(text(), 'DGCA report')]";
    private final String DGCAsearch = "//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')]";
    private final String DGCAdownload = "//span[contains(text(), 'Download')]";

    private final String ACUandGPU = "//p[contains(text(), 'ACU & GPU utilization')]";
    private final String ACUandGPUsearch = "//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')]";
    private final String ACUandGPUdownload = "//span[contains(text(), 'Download')]";

    private final String StationwiseReport = "//p[contains(text(), 'Station Wise Report')]";
    private final String StationReportsearch = "//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')]";
    private final String StationRportdownload = "//span[contains(text(), 'Download')]";

    private final String ACUGPUUtilizationReport = "//p[contains(text(),'ACU & GPU Utilization ( G-ops , Engg)')]";
    private final String ACUGPUUtilizationSearch = "//input[contains(@class,'m_8fb7ebe7 mantine-Input-input mantine-TextInput-input')]";
    private final String ACUGPUUtilizationDownload = "//span[contains(text(),'Download')]";
    private final String ACUGPUUtilizationFilter = "(//span[contains(@class,'m_8d3afb97 mantine-ActionIcon-icon')])[1]";
    private final String ACUGPUUtilizationFromDate = "(//input[contains(@class,'m_8fb7ebe7 mantine-Input-input mantine-DateInput-input')])[1]";
    private final String ACUGPUUtilizationToDate = "(//input[contains(@class,'m_8fb7ebe7 mantine-Input-input mantine-DateInput-input')])[2]";












    public Report(Page page) {
        this.page = page;
    }
    public void Report() throws InterruptedException {


        page.locator(Report).click();
        Thread.sleep(10000);

    /*    page.locator(DelayReportClick).click();
        Thread.sleep(10000);
        page.locator(DelayFilter).click();
        page.locator(DelayFilterFrom).click();
        page.locator(DelayFilterTo).click();
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
        page.goBack();

        page.locator(MISreport).click();
        page.locator(SearchMISreport).click();
        page.locator(SearchMISreport).fill("IC 5904");
        page.locator(DownloadMISreport).hover();
        Thread.sleep(10000);
        page.goBack();

        page.locator(DGCAreport).click();
        page.locator(DGCAsearch).click();
        page.locator(DGCAsearch).fill("GOX");
        page.locator(DGCAdownload).hover();
        Thread.sleep(10000);
        page.goBack();

        page.locator(ACUandGPU).click();
        page.locator(ACUandGPUsearch).click();
        page.locator(ACUandGPUsearch).fill("FIB");
        page.locator(ACUandGPUdownload).hover();
        Thread.sleep(10000);
        page.goBack();

        page.locator(StationwiseReport).click();
        page.locator(StationReportsearch).click();
        page.locator(StationReportsearch).fill("JLG");
        page.locator(StationRportdownload).hover();
        Thread.sleep(10000);*/

        page.locator(ACUGPUUtilizationReport).click();
        page.locator(ACUGPUUtilizationSearch).fill("maintenance");
        page.locator(ACUGPUUtilizationFilter).click();
        page.locator(ACUGPUUtilizationFromDate).click();
        page.locator(ACUGPUUtilizationFromDate).clear();
        page.locator(ACUGPUUtilizationFromDate).fill("July 1, 2025");
        Thread.sleep(5000);
        page.locator(ACUGPUUtilizationFromDate).press("Tab");
        page.locator(ACUGPUUtilizationToDate).click();
        page.locator(ACUGPUUtilizationToDate).clear();
        page.locator(ACUGPUUtilizationToDate).fill("July 31, 2025");
        page.locator(ACUGPUUtilizationToDate).press("Tab");
        Thread.sleep(5000);
        page.locator(ACUGPUUtilizationFilter).click();
        page.locator(ACUGPUUtilizationDownload).hover();
        Thread.sleep(10000);





    }





    public void doReport() throws InterruptedException {
        Report();
    }
}
