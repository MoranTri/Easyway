package WorkFlows;

import Activities.Actions.dbActions;
import Activities.Actions.webActions;
import Activities.Verifications.verifications;
import Utilities.commonOperations;
import io.qameta.allure.Step;

import java.util.List;

public class webFlows extends commonOperations
{
    @Step("Navigate to faq page and verify.")
    private static void navigateToFaqPage()
    {
        webActions.clickOnElement(headerBar.btn_faq);
        verifications.textInElementAsExpectedText(faqPage.txt_faqPageTitle, "FAQ");
    }

    @Step("Navigate to faq page and print to the screen all the Faq question, and their answers.")
    public static void printAllTheFaqQuestionAndAnswers()
    {
        navigateToFaqPage();

        for(int i = 0 ; i<faqPage.list_questions.size() ; i++)
        {
            System.out.println(faqPage.list_questions.get(i).getText());
            faqPage.list_questions.get(i).click();
            System.out.println(faqPage.list_answers.get(i).getText() + "\n");
        }

        //Sleep for 5 seconds to see the questions and answers.
        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }

    @Step("Navigate to contact us page and verify.")
    private static void navigateToContactUsPage()
    {
        webActions.clickOnElement(headerBar.btn_contactUs);
        verifications.textInElementAsExpectedText(contactUsPage.txt_contactUsPageTitle, "CONTACT US");
    }

    @Step("Navigate to contact us page and fill the form fields with my details.")
    public static void fillContactUsFieldsWithMyDetails()
    {
        navigateToContactUsPage();

        List<String> details = dbActions.getDetailsFromDB(getDataFromXMLFile("query"));

        webActions.writeInElement(contactUsPage.input_name, details.get(0));
        webActions.writeInElement(contactUsPage.input_company, details.get(1));
        webActions.writeInElement(contactUsPage.input_email, details.get(2));
        webActions.writeInElement(contactUsPage.input_subject, details.get(3));
        webActions.writeInElement(contactUsPage.input_message, details.get(4));

        //Sleep for 5 seconds to see my details. :)
        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }

}
