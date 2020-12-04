package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class joinUsPage
{
    @FindBy(how = How.CSS, using = "h1[class='join header']")
    public WebElement txt_joinUsTitle;

    //join header
    @FindBy(how = How.CSS, using = "a[href='https://grnh.se/6afbd5022']")
    public WebElement btn_positions;
}
