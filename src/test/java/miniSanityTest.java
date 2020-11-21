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
    @Test(priority = 0, description = "Test01: Write search item in the search box and verify.")
    @Description("Test Description: Writing 'Pizza' in the search box and verifying that the result header contain the searched word.")
    public void test01_writePizzaInSearchFieldAndVerify()
    {
        String searchItem = "פיצה";
        webFlows.enterItemToSearchAndClick(mainPage.input_searchBox, searchItem, mainPage.btn_search);
        verifications.elementContainsSearchedText(mainPage.text_searchTitle, searchItem);
    }

    @Test(priority = 1, description = "Test02: Click randomly on food type header and verify.")
    @Description("Test Description: Upon entering the site main page, the automation choose randomly food type and click it, then verify the shown result are the same food type as the automation choose.")
    public void test02_clickRandomlyOnFoodTypeAndVerify()
    {
        String foodTypeChosen = webFlows.clickRandomlyOnFoodTypeFromSideList(mainPage.text_foodTypesHeaderList);
        verifications.elementContainsExactText(mainPage.text_searchTag, foodTypeChosen);
    }

    @Test(priority = 2, description = "Test03: Get address from DB and write it in the address section to get results of restaurants that make delivery to my address, then verify the results are to the address same as I wrote (got from DB).")
    public void test03_enterAddressAndVerify()
    {
        verifications.elementContainsExactText(mainPage.text_addressInSearchTitle, webFlows.enterAddressAndSearchAndReturn());
    }
}
