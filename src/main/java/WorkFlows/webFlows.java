package WorkFlows;

import Activities.Actions.dbActions;
import Activities.Actions.webActions;
import Activities.Verifications.verifications;
import Utilities.commonOperations;
import io.qameta.allure.Step;
import java.util.List;

public class webFlows extends commonOperations
{
    @Step("Closing the cookies popup when entering the site.")
    public static void closeCookiesPopup()
    {
        webActions.clickOnElement(mainPagePopup.btn_allowAllCookies);
    }

    @Step("Navigate to contact us page.")
    private static void navigateToContactUsPage()
    {
        webActions.hoverOnElementAndClick(headerBar.btn_about, aboutDropdown.btn_contactUs);
        verifications.textInElementAsExpectedText(contactUsPage.txt_contactUsTitle, "Contact Us");
    }

    @Step("Navigate to book a demo page.")
    private static void navigateToBookDemo()
    {
        webActions.clickOnElement(contactUsPage.btn_requestADemo);
        verifications.textInElementAsExpectedText(requestDemoPage.txt_requestDemoPageTitle, "Book a Demo");
    }

    @Step("Request a demo flow, navigating to the correct page and filling the form details.")
    public static void requestADemo()
    {
        navigateToContactUsPage();
        navigateToBookDemo();

        List<String> formDetails = dbActions.getDetailsFromDB(getDataFromXMLFile("query"));
        webActions.writeInElement(requestDemoPage.input_firstName, formDetails.get(0));
        webActions.writeInElement(requestDemoPage.input_lastName, formDetails.get(1));
        webActions.writeInElement(requestDemoPage.input_email, formDetails.get(2));
        webActions.writeInElement(requestDemoPage.input_companyName, formDetails.get(3));
        webActions.writeInElement(requestDemoPage.input_jobTitle, formDetails.get(4));
        webActions.chooseValueInSelectElement(requestDemoPage.select_depatment, formDetails.get(5));
        webActions.chooseValueInSelectElement(requestDemoPage.select_country, formDetails.get(6));
        webActions.writeInElement(requestDemoPage.input_phoneNumber, formDetails.get(7));
        webActions.chooseValueInSelectElement(requestDemoPage.select_industry, formDetails.get(8));
        webActions.writeInElement(requestDemoPage.input_message, formDetails.get(9));
    }

    @Step("Navigate to banking solutions page.")
    private static void navigateToBankingSolutions()
    {
        webActions.clickOnElement(mainPage.btn_earnixBanking);
        verifications.textInElementAsExpectedText(bankingSolutions.txt_bankingSolutionsTitle, "Pricing operations. expowered");
    }

    @Step("Playing banking solutions flow, navigating to the correct page and frame and playing the video.")
    public static void playBankingSolutionsVideo()
    {
        navigateToBankingSolutions();

        webActions.switchToFrame(bankingSolutions.iframe);
        webActions.clickOnElement(bankingSolutions.btn_playButton);

        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }

        webActions.backToParentFrame();
    }
}
