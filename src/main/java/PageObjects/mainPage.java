package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class mainPage
{
    @FindBy(how = How.ID, using = "dishkey")
    public WebElement input_searchBox;

    @FindBy(how = How.ID, using = "dishkeyIcon")
    public WebElement btn_search;

    @FindBy(how = How.ID, using = "mainSearchTitle")
    public WebElement text_searchTitle;

    @FindBy(how = How.CSS, using = "span[class='search-tag-text']")
    public WebElement text_searchTag;

    @FindBy(how = How.CSS, using = "a[class='heading category-link']")
    public List<WebElement> text_foodTypesHeaderList;

    @FindBy(how = How.XPATH, using = "//div[@class='focus-light']/li")
    public List<WebElement> text_foodTypeSection;

    @FindBy(how = How.ID, using = "open_find_me_popup")
    public WebElement btn_editAddress;

    @FindBy(how = How.XPATH, using = "//h2[@id='resultsTitle']//span[@data-role='full_address']")
    public WebElement text_addressInSearchTitle;
}
