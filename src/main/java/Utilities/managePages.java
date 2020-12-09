package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base
{
    public static void initPages()
    {
        mainPage = PageFactory.initElements(driver, PageObjects.mainPage.class);
        headerBar = PageFactory.initElements(driver, PageObjects.headerBar.class);
        contactUsPage = PageFactory.initElements(driver, PageObjects.contactUsPage.class);
        loginPage = PageFactory.initElements(driver, PageObjects.loginPage.class);
        mainDashboardPage = PageFactory.initElements(driver, PageObjects.dashBoard.mainDashboardPage.class);
        adminSettingsPage = PageFactory.initElements(driver, PageObjects.dashBoard.adminSettingsPage.class);
    }
}
