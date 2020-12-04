import Utilities.commonOperations;
import Utilities.listeners;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Activities.Verifications.verifications;

@Listeners(listeners.class)
public class miniSanityTest extends commonOperations
{
    @Test(priority = 0, description = "Test01: Verify successful entrance to earnix site.")
    @Description("Test Description: Verifying successful entrance to earnix site by locating the main page header.")
    public void test01_successfulEntrance()
    {
        verifications.textInElementAsExpectedText(mainPage.txt_homePageTitle, "Faster. Smarter. Safer.");
    }

    @Test(priority = 1, description = "Test02: Filling all the request demo form with DB details.")
    @Description("Test Description: Navigating to book a demo page and fill the details from DB details.")
    public void test02_bookADemoWithDBDetails() throws InterruptedException
    {
        webFlows.requestADemo();
        Thread.sleep(3000);
    }

    @Test(priority = 2, description = "Test03: Playing video locate in different frame.")
    @Description("Test Description: Navigating to banking solutions page and playing the video which locate in a different frame.")
    public void test03_playingBankingSolutionsVideo()
    {
        webFlows.playBankingSolutionsVideo();
    }
}
