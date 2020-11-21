package WorkFlows;

import Activities.Actions.dbActions;
import Activities.Actions.webActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import Utilities.commonOperations;

import java.util.List;
import java.util.Random;

public class webFlows extends commonOperations
{
    @Step("Closing the popup when appear.")
    private static void closePopUp()
    {
        if (popup.popupWindow.size() > 0)
        {
            System.out.println("Pop-up appeared.");
            webActions.clickOnElement(popup.btn_closePopup);
        }
        else
        {
            System.out.println("Pop-up not appeared.");
        }
    }

    @Step("Closing the address side popup when appear.")
    public static void closeSidePopUp()
    {
        if (addressSidebar.sidePopup.isDisplayed())
        {
            System.out.println("Side pop-up appeared.");
            webActions.clickOnElement(addressSidebar.btn_closePopup);
        }
        else
        {
            System.out.println("Side pop-up not appeared.");
        }
    }

    @Step("Closed the popups.")
    public static void closePopUps()
    {
        closePopUp();
        closeSidePopUp();
    }

    @Step("Return randomised number in a range of 1 to the given array size.")
    public static int getRandomlyIndexFromArray(List<WebElement> elem)
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(elem.size());
        System.out.println("Random Number: " + randomNumber);
        return randomNumber;
    }

    @Step("Write item to search in the text-box and then click on the search icon.")
    public static void enterItemToSearchAndClick(WebElement searchBoxInput, String itemToSearch, WebElement searchBoxIcon)
    {
        webActions.writeInElement(searchBoxInput, itemToSearch);
        webActions.clickOnElement(searchBoxIcon);
    }

    @Step("Click randomly on food type from the side list.")
    public static String clickRandomlyOnFoodTypeFromSideList(List<WebElement> list)
    {
        int randomIndex = webFlows.getRandomlyIndexFromArray(list);
        webActions.scrollElementIntoView(mainPage.text_foodTypeSection.get(randomIndex));
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        webActions.clickOnElement(list.get(randomIndex));
        return list.get(randomIndex).getText();
    }

    @Step("Open the address sidebar.")
    public static void openAddressSidebar()
    {
        webActions.clickOnElement(mainPage.btn_editAddress);
    }

    @Step("Get address from DB and write it in the text-boxes, return the full address.")
    public static String enterAddressAndSearchAndReturn()
    {
        openAddressSidebar();
        List<String> addressArray = dbActions.getAddressFromDB(getDataFromXMLFile("query"));

        webActions.writeInElementAndClickOnDropdown(addressSidebar.input_cityName, addressArray.get(0), addressSidebar.btn_autoComplete);
        webActions.writeInElementAndClickOnDropdown(addressSidebar.input_streetName, addressArray.get(1), addressSidebar.btn_autoComplete);
        webActions.writeInElement(addressSidebar.input_buildingNumber, addressArray.get(2));
        webActions.clickOnElement(addressSidebar.btn_search);
        return addressArray.get(1) + " " + addressArray.get(2) + ", " + addressArray.get(0);
    }
}
