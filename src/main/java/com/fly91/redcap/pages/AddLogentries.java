package com.fly91.redcap.pages;

import com.microsoft.playwright.Page;

public class AddLogentries {
    private Page page;

       private final String SelectStation = ".css-19bb58m";
       private final String day = "text=Today";

       private final String flighttype = "text=Base Flight";
       private final String flightnumber ="(//div[contains(@class, 'css-19bb58m')])[2]";
       private final String aircraftTail = "(//div[contains(@class, 'css-19bb58m')])[3]";
       private final String SecuritySearchStart = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String SecuritySearchEnd = "(//span[contains(@class, 'm_811560b9 mantine-Button-label')])[1]";
       private final String CleaningStart = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String CleaningEnd = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String GPUin = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String GPUout = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String ToiletwaterserviceIN = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String ToiletwaterserviceOUT = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String ACUin = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String ACUout = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String cabincrewReport = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String cateringStart = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String cateringEnd = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String cockpitCrewReport = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String boardingStart = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String boardingEnd = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String carcoDooropen = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String baggageLoadingStart = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String baggageLoadingFininsh = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String carcoDoorclose = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String ACMcount = "//*[@id=\"root\"]/div/div/main/div/form/div[2]/div/div[24]/div/div/button[2]";
       private final String firstPaxOnboard = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String lastPaxOnboard = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String bagCountpcs = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[23]";
       private final String bagCountweight = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[24]";
       private final String c1 = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-NumberInput-input')])[1]";
       private final String c2 = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-NumberInput-input')])[2]";
       private final String c3 = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-NumberInput-input')])[3]";
       private final String c4 = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-NumberInput-input')])[4]";
       private final String LTsubmitted = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String LTsignOff = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String ARCsubmitted = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String ARCsignOff = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String Doorclose = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String ChocksOff = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String Airborne = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";

       private final String Teglog = "(//button[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-FileInput-input')])[1]";

       private final String SSR = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[32]";
       private final String Pax = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[33]";
       private final String Inf = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[34]";
       private final String P1 = "(//div[contains(@class, 'css-19bb58m')])[4]";
       private final String P2 = "(//div[contains(@class, 'css-19bb58m')])[5]";
       private final String SCC = "(//div[contains(@class, 'css-19bb58m')])[6]";
       private final String CC = "(//div[contains(@class, 'css-19bb58m')])[7]";
       private final String observer = "(//div[contains(@class, 'css-19bb58m')])[8]";
       private final String remarks = "(//div[contains(@class, 'css-19bb58m')])[9]";
       private final String Reset = "text=Reset";
       private final String Submit = "//span[contains(text(), 'Submit')]";

// Arrival Flight (Night Halt Flight)
       private final String Arrivalflighttype = "text=Night Halt Flight";
       private final String Touchdown = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String ChocksOn = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String DoorOpen = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String CargoDoorOpen = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String FirstBaggageOffload = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String LastBaggageOffload = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String FirstPaxDeplane = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String LastPaxDeplane = "(//span[contains(@class, 'm_80f1301b mantine-Button-inner')])[1]";
       private final String Arrivalremarks = "(//div[contains(@class, 'css-hlgwow')])[3]";











    public AddLogentries(Page page) {
        this.page = page;
    }

    public void Station() throws InterruptedException {

// Departure Flight (Base Flight)
        page.locator(SelectStation).click();
        page.locator(SelectStation).press("ArrowDown");
        page.locator(SelectStation).press("Enter");
        page.locator(day).click();
        page.locator(flighttype).click();
        Thread.sleep(10000);
        page.locator(flightnumber).click();
        page.locator(flightnumber).press("ArrowDown");
        page.locator(flightnumber).press("Enter");
        Thread.sleep(10000);
        page.locator(aircraftTail).click();
        page.locator(aircraftTail).press("ArrowDown");
        page.locator(aircraftTail).press("ArrowDown");
        page.locator(aircraftTail).press("Enter");
        page.locator(SecuritySearchStart).click();
        page.locator(SecuritySearchEnd).click();
        page.locator(CleaningStart).click();
        page.locator(CleaningEnd).click();
        page.locator(GPUin).click();
        page.locator(GPUout).click();
        Thread.sleep(10000);
        page.locator(ToiletwaterserviceIN).click();
        page.locator(ToiletwaterserviceOUT).click();
        //Thread.sleep(10000);
        page.locator(ACUin).click();
        page.locator(ACUout).click();
        page.locator(cabincrewReport).click();
        page.locator(cateringStart).click();
        page.locator(cateringEnd).click();
        page.locator(cockpitCrewReport).click();
        page.locator(boardingStart).click();
        page.locator(boardingEnd).click();
        page.locator(carcoDooropen).click();
        page.locator(baggageLoadingStart).click();
        page.locator(baggageLoadingFininsh).click();
        page.locator(carcoDoorclose).click();
        page.locator(ACMcount).click();
        page.locator(firstPaxOnboard).click();
        page.locator(lastPaxOnboard).click();
        //page.locator(bagCountpcs).clear();
        page.locator(bagCountpcs).click();
        page.locator(bagCountpcs).fill("10");
        page.locator(bagCountweight).fill("100");
        //page.locator(c1).clear();
        page.locator(c1).fill("10");
        page.locator(c2).fill("10");
        page.locator(c3).fill("10");
        page.locator(c4).fill("10");
        Thread.sleep(10000);
        page.locator(LTsubmitted).click();
        page.locator(LTsignOff).click();
        page.locator(ARCsubmitted).click();
        page.locator(ARCsignOff).click();
        page.locator(Doorclose).click();
        page.locator(ChocksOff).click();
        page.locator(Airborne).click();
        //page.locator(Teglog).click();
        page.locator(SSR).click();
        page.locator(SSR).fill("0");
        page.locator(Pax).fill("70");
        page.locator(Inf).fill("2");
        page.locator(P1).click();
        page.locator(P1).press("ArrowDown");
        page.locator(P1).press("Enter");
        page.locator(P2).click();
        page.locator(P2).press("ArrowDown");
        page.locator(P2).press("Enter");
        page.locator(SCC).click();
        page.locator(SCC).press("ArrowDown");
        page.locator(SCC).press("Enter");
        page.locator(CC).click();
        page.locator(CC).press("ArrowDown");
        page.locator(CC).press("Enter");
        page.locator(observer).click();
        page.locator(observer).press("ArrowDown");
        page.locator(observer).press("Enter");
        page.locator(remarks).click();
        page.locator(remarks).press("ArrowDown");
        page.locator(remarks).press("Enter");
        Thread.sleep(10000);
        page.locator(Reset).click();
        //page.locator(Submit).click();
        Thread.sleep(10000);



// Arrival Flight (Night Halt Flight)
        page.locator(SelectStation).click();
        page.locator(SelectStation).press("ArrowDown");
        page.locator(SelectStation).press("Enter");
        page.locator(day).click();
        page.locator(Arrivalflighttype).click();
        page.locator(flightnumber).click();
        page.locator(flightnumber).press("ArrowDown");
        page.locator(flightnumber).press("Enter");
        Thread.sleep(10000);
        page.locator(Touchdown).click();
        page.locator(ChocksOn).click();
        page.locator(DoorOpen).click();
        page.locator(CargoDoorOpen).click();
        page.locator(FirstBaggageOffload).click();
        page.locator(LastBaggageOffload).click();
        page.locator(FirstPaxDeplane).click();
        page.locator(LastPaxDeplane).click();
        page.locator(Arrivalremarks).click();
        page.locator(Arrivalremarks).press("ArrowDown");
        page.locator(Arrivalremarks).press("Enter");
        Thread.sleep(10000);
        page.locator(Reset).click();
        Thread.sleep(10000);




    }

    public void doAddLogentries() throws InterruptedException {
        Station();
    }
}


