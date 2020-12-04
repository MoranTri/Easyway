package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class headerBar
{
    @FindBy(how = How.ID, using = "n-contact-us")
    public WebElement btn_contactUs;

    @FindBy(how = How.ID, using = "n-join-us")
    public WebElement btn_joinUs;
}
