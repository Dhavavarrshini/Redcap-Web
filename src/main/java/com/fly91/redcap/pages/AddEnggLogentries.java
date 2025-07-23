package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class AddEnggLogentries {
    private Page page;

    private final String AddEnggLogentries = "(//p[contains(text(), 'Add Engg Log Entries')])[1]";
    private final String Station = "(//div[contains(@class, 'css-hlgwow')])[1]";
    private final String UsageType = "(//div[contains(@class, 'css-hlgwow')])[2]";
    private final String AircraftTail = "(//div[contains(@class, 'css-hlgwow')])[3]";

    private final String GPUin = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
    private final String GPUout = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
    private final String ACUin = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
    private final String ACUinFill = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[3]";
    private final String ACUout = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
    private final String ToiletWaterServiceIn = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
    private final String ToiletWaterServiceOut = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
    private final String Remarks = "//textarea[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-Textarea-input')]";
    private final String Submit = "//span[contains(text(), 'Submit')]";
    private final String Reset = "//span[contains(text(), 'Reset')]";
    private final String Confirmbutton = "//span[contains(text(), 'Confirm')]";








    public AddEnggLogentries(Page page) {
        this.page = page;
    }
    public void AddEnggLogentries() throws InterruptedException {
        page.locator(AddEnggLogentries).click();
        Thread.sleep(10000);
        page.locator(Station).click();
        page.locator(Station).press("ArrowDown");
        page.locator(Station).press("Enter");

        page.locator(UsageType).click();
        page.locator(UsageType).type("Main");
        page.locator(UsageType).press("Enter");

        page.locator(AircraftTail).click();
        page.locator(AircraftTail).press("ArrowDown");
        page.locator(AircraftTail).press("Enter");
        Thread.sleep(10000);

        page.locator(GPUin).click();
        page.locator(GPUout).click();
        page.locator(ACUin).click();
        page.locator(ACUinFill).fill("13:20");
        page.locator(ACUout).click();
        page.locator(ToiletWaterServiceIn).click();
        page.locator(ToiletWaterServiceOut).click();
        page.locator(Remarks).fill("Automation");
        Thread.sleep(10000);
        page.locator(Reset).click();
        /*page.locator(Submit).click();
        page.locator(Confirmbutton).click();*/
        Thread.sleep(10000);




    }





    public void doAddEnggLogentries() throws InterruptedException {
        AddEnggLogentries();
    }
}
