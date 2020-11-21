package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class addressSidebar
{
    @FindBy(how = How.ID, using = "locationModalBlock")
    public WebElement sidePopup;

    @FindBy(how = How.ID, using = "close-location-modal")
    public WebElement btn_closePopup;

    @FindBy(how = How.ID, using = "city")
    public WebElement input_cityName;

    @FindBy(how = How.ID, using = "street")
    public WebElement input_streetName;

    @FindBy(how = How.ID, using = "building")
    public WebElement input_buildingNumber;

    @FindBy(how = How.CSS, using = "div[class='autocompleteElement autocomplete-active'")
    public WebElement btn_autoComplete;

    @FindBy(how = How.XPATH, using = "//button[@id='searchResturantsButton']")
    public WebElement btn_search;
}
