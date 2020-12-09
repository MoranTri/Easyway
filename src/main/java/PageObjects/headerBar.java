package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class headerBar
{
    @FindBy(how = How.CSS, using = "a[href='./contact-us']")
    public WebElement btn_contactSales;

    @FindBy(how = How.CSS, using = "a[href='http://reception.easyway.ai/']")
    public WebElement btn_login;
}
