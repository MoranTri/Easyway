package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{
    @FindBy(how = How.CLASS_NAME, using = "homepage-first-screen-title")
    public WebElement txt_homePageTitle;

    @FindBy(how = How.CSS, using = "a[href='/banking-solutions/']")
    public WebElement btn_earnixBanking;

    //"/banking-solutions/"
}
