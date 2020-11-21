package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base
{
    public static void initPages()
    {
        mainPage = PageFactory.initElements(driver, PageObjects.mainPage.class);
        addressSidebar = PageFactory.initElements(driver, PageObjects.addressSidebar.class);
        popup = PageFactory.initElements(driver, PageObjects.popup.class);
    }
}
