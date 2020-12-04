package Activities.Actions;

import Utilities.commonOperations;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class webActions extends commonOperations
{
    @Step("Click of element.")
    public static void clickOnElement(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    @Step("Sending text to text-field.")
    public static void writeInElement(WebElement element, String textToWrite)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(textToWrite);
    }

    @Step("Choosing a value from select element.")
    public static void chooseValueInSelectElement(WebElement selectElement, String valueToChoose)
    {
        wait.until(ExpectedConditions.visibilityOf(selectElement));
        Select selector = new Select(selectElement);
        selector.selectByVisibleText(valueToChoose);
    }
}
