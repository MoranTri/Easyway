package Activities.Verifications;

import Utilities.commonOperations;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class verifications extends commonOperations
{
    @Step("Verify the element contains the expected text.")
    public static void elementContainsSearchedText(WebElement element, String textToSearchInTheElement)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
        assertTrue(element.getText().contains(textToSearchInTheElement));
    }

    @Step("Verify the text in element is the same as expected text.")
    public static void elementContainsExactText(WebElement element, String textToSearchInTheElement)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
        assertEquals(element.getText(), textToSearchInTheElement);
    }
}
