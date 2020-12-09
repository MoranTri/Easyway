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
    @Test(priority = 0, description = "Test01: Verify successful entrance to easyway site.")
    @Description("Test Description: Verifying successful entrance to Beaconcure site by verifying the main page header text.")
    public void test01_successfulEntrance()
    {
        verifications.textInElementAsExpectedText(mainPage.txt_homePageTitle, "Contactless communication with your guests");
    }

    @Test(priority = 1, description = "Test02: Filling contact sales form.")
    @Description("Test Description: Navigate to contact sales page and filling the contact form.")
    public void test02_contactSalesForm()
    {
        webFlows.fillContactForm();
    }

    @Test(priority = 2, description = "Test03: Entering the dashboard and activating the admin settings.")
    @Description("Test Description: Navigate to the dashboard, changing the automation focus to the dashboard tab, login to the system with credentials stored in DB, and activating the admin settings.")
    public void test03_dashboardLoginAndActivateAdminSettings()
    {
        webFlows.loginToDashboard();
        webFlows.activeAllSettings();
    }

}
