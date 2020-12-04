package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{
    @FindBy(how = How.CSS, using = "p[class='logo short-desc']")
    public WebElement txt_homePageTitle;
}
