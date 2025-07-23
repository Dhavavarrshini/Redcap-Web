package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class WhatsAppHistory {
    private Page page;

    private final String ClickwhatsApphistory = "text=Whatsapp History";
    private final String ClickSpecific = "(//p[contains(@class, 'mantine-focus-auto m_b6d8b162 mantine-Text-root')])[15]";
    private final String close = "xpath=/html/body/div[4]/div/div/div[2]/section/header/button/svg";
    private final String Navigation = "(//button[contains(@class, 'mantine-focus-auto mantine-active m_326d024a mantine-Pagination-control m_87cf2631 mantine-UnstyledButton-root')])[9]";










    public WhatsAppHistory(Page page) {
        this.page = page;
    }
    public void WhatsAppHistory() throws InterruptedException {
        page.locator(ClickwhatsApphistory).click();
        Thread.sleep(10000);
        page.locator(ClickSpecific).click();
        Thread.sleep(10000);
        page.goBack();
    //    page.locator(close).click();
    //    page.locator(Navigation).click();
    //    Thread.sleep(10000);




    }

    public void doWhatsAppHistory() throws InterruptedException {
        WhatsAppHistory();
    }
}
