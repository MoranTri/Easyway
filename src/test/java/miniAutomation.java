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
    @Test(priority = 0, description = "Test01: Verify successful entrance to spectory site.")
    @Description("Test Description: Verifying successful entrance to spectory site by locating the main page header.")
    public void test01_successfulEntrance()
    {
        verifications.textInElementAsExpectedText(mainPage.txt_homePageTitle, "We provide professional, customer-centric software development solutions to startups, large companies and organizations worldwide");
    }

    @Test(priority = 1, description = "Test02: Fill contact us form fields with details stored in DB.")
    @Description("Test Description: Navigate to contact us page and fill the form fields with details stored in my DB.")
    public void test02_contactUsWithDBDetails()
    {
        webFlows.fillContactUsDetails();
    }

    @Test(priority = 2, description = "Test03: Qa automation position details fill.")
    @Description("Test Description: Navigate to the qa automation position page and fill all the fields with my details.")
    public void test03_qAAutomationPositionWithMyDetails()
    {
        webFlows.fillQAAutomationPositionDetails();
    }
}
