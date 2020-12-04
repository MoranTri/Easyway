package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class contactUsPage
{
    @FindBy(how = How.CSS, using = "h1[class='contact header ']")
    public WebElement txt_contactUsTitle;

    @FindBy(how = How.NAME, using = "your-name")
    public WebElement input_yourName;

    @FindBy(how = How.NAME, using = "your-email")
    public WebElement input_yourEmail;

    @FindBy(how = How.NAME, using = "your-project")
    public WebElement input_yourProject;

    @FindBy(how = How.NAME, using = "your-select")
    public WebElement select_engagement;
}
