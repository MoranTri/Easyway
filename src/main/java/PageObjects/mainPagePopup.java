package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPagePopup
{
    @FindBy(how = How.ID, using = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement btn_allowAllCookies;
}
