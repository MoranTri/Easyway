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

    @Step("Hovering an element to open menu, and then click on element from the opened menu.")
    public static void hoverOnElementAndClick(WebElement elementToHover, WebElement elementToClick)
    {
        wait.until(ExpectedConditions.visibilityOf(elementToHover));
        action.moveToElement(elementToHover).moveToElement(elementToClick).click().build().perform();
    }

    @Step("Choosing a value from select element.")
    public static void chooseValueInSelectElement(WebElement selectElement, String valueToChoose)
    {
        Select selector = new Select(selectElement);
        selector.selectByVisibleText(valueToChoose);
    }

    @Step("Switch to another frame.")
    public static void switchToFrame(WebElement frameElement)
    {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
    }

    @Step("Back to default frame.")
    public static void backToParentFrame()
    {
        driver.switchTo().defaultContent();
    }
}
