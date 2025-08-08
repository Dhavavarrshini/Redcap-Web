import com.fly91.redcap.pages.*;
import com.microsoft.playwright.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.naming.Context;

public class RedcapRunner {
    private static final Logger log = LoggerFactory.getLogger(RedcapRunner.class);
    Playwright playwright;
    Browser browser;
    Page page;

@BeforeMethod
    public void setup() throws InterruptedException {
       playwright = Playwright.create();
    browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

    BrowserContext context = browser.newContext();
    page = context.newPage();
    page.navigate("https://icdevredcap.pentafox.in/auth/login");


}
@Test
   public void RedcapRunner() throws InterruptedException {
    LoginPage loginPage = new LoginPage(page);
    loginPage.doLogin();

   /* AddLogentries addLogentries = new AddLogentries(page);
    addLogentries.doAddLogentries();

    Logentries logentries = new Logentries(page);
    logentries.doLogentries();

    WhatsAppHistory whatsAppHistory = new WhatsAppHistory(page);
    whatsAppHistory.doWhatsAppHistory();

    StationNumberConfig stationNumberConfig = new StationNumberConfig(page);
    stationNumberConfig.doStationNumberConfig();

    ManageUser manageUser = new ManageUser(page);
    manageUser.doManageUer();

    LoadandTrim loadandTrim = new LoadandTrim(page);
    loadandTrim.doLoadandTrim();

    AddEnggLogentries addEnggLogentries = new AddEnggLogentries(page);
    addEnggLogentries.doAddEnggLogentries();

    EnggLogEntries enggLogEntries = new EnggLogEntries(page);
    enggLogEntries.doEnggLogEntries();

    Report report = new Report(page);
    report.doReport();

    LnTuser lnTuser = new LnTuser(page);
    lnTuser.doLnTuser();*/

    Profile profile = new Profile(page);
    profile.doProfile();

}
@AfterMethod
    public void tearDown() {
        browser.close();
        playwright.close();
    }

}
