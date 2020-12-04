package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base
{
    public static void initPages()
    {
        mainPage = PageFactory.initElements(driver, PageObjects.mainPage.class);
        headerBar = PageFactory.initElements(driver, PageObjects.headerBar.class);
        contactUsPage = PageFactory.initElements(driver, PageObjects.contactUsPage.class);
        joinUsPage = PageFactory.initElements(driver, PageObjects.joinUsPage.class);
        positionsPage = PageFactory.initElements(driver, PageObjects.positionsPage.class);
    }
}
