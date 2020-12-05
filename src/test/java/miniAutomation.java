import Utilities.commonOperations;
import Utilities.listeners;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Activities.Verifications.verifications;

@Listeners(listeners.class)
public class miniAutomation extends commonOperations
{
    @Test(priority = 0, description = "Test01: Verify successful entrance to Beaconcure site.")
    @Description("Test Description: Verifying successful entrance to Beaconcure site by verifying the main page header text.")
    public void test01_successfulEntrance()
    {
        verifications.textInElementAsExpectedText(mainPage.txt_homePageTitle, "INTELLIGENT CLINICAL DATA ANALYSIS");
    }

    @Test(priority = 1, description = "Test02: Displaying all the FAQ question and answers.")
    @Description("Test Description: Navigate to FAQ page and displaying to the screen all the questions, and then click on each question to revel the answer and displaying the answer to the screen also.")
    public void test02_displayFaqQuestionsAndAnswers()
    {
        webFlows.printAllTheFaqQuestionAndAnswers();
    }

    @Test(priority = 2, description = "Test03 : Filling the contact us form fields with my details stored in DB.")
    @Description("Test Description: Navigate to contact us page and filling the fields with my details, which are stored in DB.")
    public void test03_contactUsFormWithDBDetails()
    {
        webFlows.fillContactUsFieldsWithMyDetails();
    }

}
