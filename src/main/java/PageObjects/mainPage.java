package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{
    @FindBy(how = How.CLASS_NAME, using = "font_4")
    public WebElement txt_homePageTitle;
}
