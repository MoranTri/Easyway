package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base
{
    public static void initPages()
    {
        mainPage = PageFactory.initElements(driver, PageObjects.mainPage.class);
        headerBar = PageFactory.initElements(driver, PageObjects.headerBar.class);
        faqPage = PageFactory.initElements(driver, PageObjects.faqPage.class);
        contactUsPage = PageFactory.initElements(driver, PageObjects.contactUsPage.class);
    }
}
