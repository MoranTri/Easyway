package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class aboutDropdown
{
    @FindBy(how = How.LINK_TEXT, using = "Contact Us")
    public WebElement btn_contactUs;
}
