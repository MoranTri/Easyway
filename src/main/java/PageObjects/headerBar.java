package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class headerBar
{
    @FindBy(how = How.ID, using = "menu-item-16")
    public WebElement btn_faq;

    @FindBy(how = How.ID, using = "menu-item-14")
    public WebElement btn_contactUs;
}
