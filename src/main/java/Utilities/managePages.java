package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base
{
    public static void initPages()
    {
        mainPage = PageFactory.initElements(driver, PageObjects.mainPage.class);
        mainPagePopup = PageFactory.initElements(driver, PageObjects.mainPagePopup.class);
        headerBar = PageFactory.initElements(driver, PageObjects.headerBar.class);
        aboutDropdown = PageFactory.initElements(driver, PageObjects.aboutDropdown.class);
        contactUsPage = PageFactory.initElements(driver, PageObjects.contactUsPage.class);
        requestDemoPage = PageFactory.initElements(driver, PageObjects.requestDemoPage.class);
        bankingSolutions = PageFactory.initElements(driver, PageObjects.bankingSolutions.class);
    }
}
