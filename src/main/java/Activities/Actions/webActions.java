package Activities.Actions;

import Utilities.commonOperations;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class webActions extends commonOperations
{
    @Step("Click of element.")
    public static void clickOnElement(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    @Step("Sending text to text-field.")
    public static void writeInElement(WebElement element, String textToWrite)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(textToWrite);
    }

    @Step("Sending text to text-field, and then click of the exact dropdown result.")
    public static void writeInElementAndClickOnDropdown(WebElement textboxElement, String textToWrite, WebElement dropdownElementToChoose)
    {
        wait.until(ExpectedConditions.visibilityOf(textboxElement));
        textboxElement.sendKeys(textToWrite);
        try
        {
            Thread.sleep(1000);
            dropdownElementToChoose.click();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }

    @Step("Waiting for list to be loaded completely.")
    public static void waitForListToLoad(List<WebElement> listToBeLoaded)
    {
        wait.until(ExpectedConditions.visibilityOfAllElements(listToBeLoaded));
    }

    @Step("Scrolling to element.")
    public static void scrollElementIntoView(WebElement element)
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
