package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class contactUsPage
{
    @FindBy(how = How.CSS, using = "h1")
    public WebElement txt_contactUsPageTitle;

    @FindBy(how = How.ID, using = "your-name")
    public WebElement input_name;

    @FindBy(how = How.ID, using = "your-company")
    public WebElement input_company;

    @FindBy(how = How.ID, using = "your-email")
    public WebElement input_email;

    @FindBy(how = How.ID, using = "your-subject")
    public WebElement input_subject;

    @FindBy(how = How.ID, using = "your-message")
    public WebElement input_message;
}
