package Activities.Verifications;

import Utilities.commonOperations;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class verifications extends commonOperations
{
    @Step("Verify the text in element is the same as expected text.")
    public static void textInElementAsExpectedText(WebElement element, String textToSearchInTheElement)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
        assertEquals(element.getText(), textToSearchInTheElement);
    }

    @Step("Verify that the element is present in the page.")
    public static void elementIsPresent(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
        assertTrue(element.isDisplayed());
    }
}
