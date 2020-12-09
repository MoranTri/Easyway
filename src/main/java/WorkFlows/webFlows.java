package WorkFlows;

import Activities.Actions.dbActions;
import Activities.Actions.webActions;
import Activities.Verifications.verifications;
import Utilities.commonOperations;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class webFlows extends commonOperations
{
    @Step("Navigate to contact sales page.")
    private static void navigateToContactSalesPage()
    {
        webActions.clickOnElement(headerBar.btn_contactSales);
        verifications.textInElementAsExpectedText(contactUsPage.txt_contactUsTitle, "Contact us");
    }

    @Step("Fill contact form.")
    public static void fillContactForm()
    {
        navigateToContactSalesPage();

        webActions.writeInElement(contactUsPage.input_fullName, "Moran Treibochan");
        webActions.writeInElement(contactUsPage.input_email, "morantri@gmail.com");
        webActions.writeInElement(contactUsPage.input_hotelName, "Test test");
        webActions.writeInElement(contactUsPage.input_howCanWeHelpYou, "This is automation demonstration.");

        try
        {
            Thread.sleep(4000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Step("Navigate to the dashboard.")
    private static void navigateToDashboardPage()
    {
        webActions.clickOnElement(headerBar.btn_login);

        for(String winHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
            if (driver.getTitle().equalsIgnoreCase("EasyWay Dashboard"))
                break;
        }

        verifications.textInElementAsExpectedText(loginPage.txt_loginTitle, "Log in");
    }

    @Step("Filling login credentials using query to get the information.")
    public static void fillLoginCredentials()
    {
        List<String> credentials = dbActions.getCredentialsFromDB(getDataFromXMLFile("query"));

        webActions.writeInElement(loginPage.input_email, credentials.get(0));
        webActions.writeInElement(loginPage.input_password, credentials.get(1));
    }

    @Step("Login to the dashboard system and verify a successful entrance.")
    public static void loginToDashboard()
    {
        navigateToDashboardPage();
        fillLoginCredentials();

        webActions.clickOnElement(loginPage.btn_login);

        try
        {
            Thread.sleep(5000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        verifications.elementIsPresent(mainDashboardPage.btn_sidebarAdmin);
    }

    @Step("Activate all the setting in the admin setting page.")
    public static void activeAllSettings()
    {
        webActions.clickOnElement(mainDashboardPage.btn_sidebarAdmin);

        for (WebElement element : adminSettingsPage.list_checkboxs)
            webActions.clickOnElement(element);
    }

}
