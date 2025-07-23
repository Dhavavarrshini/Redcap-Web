package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class StationNumberConfig {
    private Page page;

      private final String Clickmodule = "//p[contains(text(), 'Station Number Config')]";
  //    private final String Clickmodule = "(//div[contains(@class, 'm_4081bf90 mantine-Group-root')])[9]";
 //     private final String Clickmodule = "text=Station Number Config";
      private final String AddConfig = "//span[contains(text(), 'Add Config')]";
      private final String Station = "//div[contains (@class, 'css-19bb58m')]";
      private final String GroundOpsNumber = "(//input[contains(@class, 'mantine-TagsInput-inputField m_45c4369d mantine-PillsInputField-field')])[1]";
      private final String ManagementNumber = "(//input[contains(@class, 'mantine-TagsInput-inputField m_45c4369d mantine-PillsInputField-field')])[2]";
      private final String IOCCnumber = "(//input[contains(@class, 'mantine-TagsInput-inputField m_45c4369d mantine-PillsInputField-field')])[3]";
      private final String Cancelbutton = "//span[contains(text(), 'Cancel')]";
      private final String Editbutton =  "(//span[contains(@class, 'm_8d3afb97 mantine-ActionIcon-icon')])[1]";














    public StationNumberConfig(Page page) {
        this.page = page;
    }
    public void StationNumberConfig() throws InterruptedException {
        page.locator(Clickmodule).click();
        Thread.sleep(10000);
        page.locator(AddConfig).click();
        page.locator(Station).click();
        page.locator(Station).press("ArrowDown");
        page.locator(Station).press("Enter");
        Thread.sleep(10000);
        page.locator(GroundOpsNumber).click();
        page.locator(GroundOpsNumber).fill("1234567890");
        page.locator(ManagementNumber).fill("1234567890");
        page.locator(IOCCnumber).fill("9876543212");
        Thread.sleep(10000);
        page.locator(Cancelbutton).click();
        Thread.sleep(10000);
        page.locator(Editbutton).click();
        Thread.sleep(10000);
        page.goBack();


    }

    public void doStationNumberConfig() throws InterruptedException {
        StationNumberConfig();
    }

}
