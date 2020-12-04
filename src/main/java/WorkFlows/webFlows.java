package WorkFlows;

import Activities.Actions.dbActions;
import Activities.Actions.webActions;
import Activities.Verifications.verifications;
import Utilities.commonOperations;
import io.qameta.allure.Step;
import java.util.List;

public class webFlows extends commonOperations
{
    @Step("Navigate to contact us page.")
    private static void navigateToContactUsPage()
    {
        webActions.clickOnElement(headerBar.btn_contactUs);
        verifications.textInElementAsExpectedText(contactUsPage.txt_contactUsTitle, "CONTACT US");
    }

    @Step("Contact us flow, navigating to the correct page and filling the form fields with details from DB.")
    public static void fillContactUsDetails()
    {
        navigateToContactUsPage();

        List<String> formDetails = dbActions.getDetailsFromDB(getDataFromXMLFile("query"));
        webActions.writeInElement(contactUsPage.input_yourName, formDetails.get(0));
        webActions.writeInElement(contactUsPage.input_yourEmail, formDetails.get(1));
        webActions.writeInElement(contactUsPage.input_yourProject, formDetails.get(2));
        webActions.chooseValueInSelectElement(contactUsPage.select_engagement, formDetails.get(3));

        //5 second sleep so you could see my details before moving on.
        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }

    @Step("Navigate to join us page.")
    private static void navigateToJoinUsPage()
    {
        webActions.clickOnElement(headerBar.btn_joinUs);
        verifications.textInElementAsExpectedText(joinUsPage.txt_joinUsTitle, "JOIN US");
    }

    @Step("Navigate to the positions page.")
    private static void navigateToPositionsPage()
    {
        webActions.clickOnElement(joinUsPage.btn_positions);
        verifications.textInElementAsExpectedText(positionsPage.txt_positionPageTitle, "Current Job Openings");
    }

    @Step("QA Automation position details flow, navigating to the correct page and filling the form fields with my details.")
    public static void fillQAAutomationPositionDetails()
    {
        navigateToJoinUsPage();
        navigateToPositionsPage();

        webActions.clickOnElement(positionsPage.btn_QAAutomationPosition);
        webActions.writeInElement(positionsPage.input_firstName, "Moran");
        webActions.writeInElement(positionsPage.input_lastName, "Treibochan");
        webActions.writeInElement(positionsPage.input_email, "morantri@gmail.com");
        webActions.writeInElement(positionsPage.input_phone, "0544426668");
        webActions.writeInElement(positionsPage.input_city, "Rishon LeZion");

        //3 second sleep so you could see my details before moving on.
        try
        {
            Thread.sleep(3000);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }

        webActions.clickOnElement(positionsPage.btn_coverLetterPaste);
        webActions.writeInElement(positionsPage.input_coverLetter, "Hello,\n" +
                "My name is Moran Treibochan.\n" +
                "I'm a QA tester with 1 year experience in manual testing, and junior QA automation without experience.\n" +
                "Due to Covid-19 pandemic, I lost my manual QA job in May 2020, but due to my passion for the QA field, I took the opportunity to level up my skills in the field, and took a comprehensive QA automation course.");

        //3 second sleep so you could see my cover letter before moving on.
        try
        {
            Thread.sleep(3000);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
        webActions.writeInElement(positionsPage.input_linkedinProfileLink, "https://www.linkedin.com/in/moran-treibochan/");
        webActions.writeInElement(positionsPage.input_websiteLink, "https://github.com/MoranTri");
        webActions.writeInElement(positionsPage.input_question, "Linkedin jobs");

        webActions.clickOnElement(positionsPage.checkbox_java);
        webActions.clickOnElement(positionsPage.checkbox_manualTesting);
        webActions.clickOnElement(positionsPage.checkbox_automationTesting);
        webActions.clickOnElement(positionsPage.checkbox_selenium);

        //3 second sleep so you could see my details before moving on.
        try
        {
            Thread.sleep(3000);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}
