package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class contactUsPage
{
    @FindBy(how = How.CSS, using = "h1")
    public WebElement txt_contactUsTitle;

    @FindBy(how = How.CSS, using = "a[href='/request-a-demo-2/']")
    public WebElement btn_requestADemo;

    //href
}
