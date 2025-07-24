package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class EnggLogEntries {
    private Page page;


    private final String EnggLogEntries = "(//p[contains(text(), 'Engg Log Entries')])[2]";
    private final String Editbutton = "(//span[contains(@class, 'm_8d3afb97 mantine-ActionIcon-icon')])[1]";
    private final String EditGPUin = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[1]";
    private final String EditGPUout = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[2]";
    private final String EditWaterServicein = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[5]";
    private final String EditWaterServiceout = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[6]";
    private final String RemarksUpdate = "//textarea[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-Textarea-input')]";
    private final String Updatebutton = "//span[contains(text(), 'Update')]";
    private final String Confirmbutton = "//span[contains(text(), 'Confirm')]";
    private final String Cancelbutton = "//span[contains(text(), 'Cancel')]";









    public EnggLogEntries(Page page) {
        this.page = page;
    }
    public void EnggLogEntries() throws InterruptedException {


        page.locator(EnggLogEntries).click();
        page.locator(Editbutton).click();
        page.locator(EditGPUin).fill("15:00");
        page.locator(EditGPUout).fill("15:00");
        page.locator(EditWaterServicein).fill("15:00");
        page.locator(EditWaterServiceout).fill("15:00");
        page.locator(RemarksUpdate).clear();
        page.locator(RemarksUpdate).fill("Automation Update");
        Thread.sleep(10000);
        page.locator(Updatebutton).click();
    //    page.locator(Confirmbutton).click();
        page.locator(Cancelbutton).click();
        Thread.sleep(10000);

    }





    public void doEnggLogEntries() throws InterruptedException {
        EnggLogEntries();
    }
}
