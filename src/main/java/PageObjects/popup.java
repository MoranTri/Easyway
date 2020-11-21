package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class popup
{
    @FindBy(how = How.CSS, using = "div[class='__ADORIC__1 __ADORIC__  ']")
    public List<WebElement> popupWindow;

    @FindBy(how = How.XPATH, using = "//div[@class='__ADORIC__1 __ADORIC__  ']//div[@data-width='24']")
    public WebElement btn_closePopup;
}
