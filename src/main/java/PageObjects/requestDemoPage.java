package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class requestDemoPage
{
    @FindBy(how = How.CSS, using = "h3")
    public WebElement txt_requestDemoPageTitle;

    @FindBy(how = How.ID, using = "FirstName")
    public WebElement input_firstName;

    @FindBy(how = How.ID, using = "LastName")
    public WebElement input_lastName;

    @FindBy(how = How.ID, using = "Email")
    public WebElement input_email;

    @FindBy(how = How.ID, using = "Company")
    public WebElement input_companyName;

    @FindBy(how = How.ID, using = "Title")
    public WebElement input_jobTitle;

    @FindBy(how = How.ID, using = "Department__c")
    public WebElement select_depatment;

    @FindBy(how = How.ID, using = "Country")
    public WebElement select_country;

    @FindBy(how = How.ID, using = "Phone")
    public WebElement input_phoneNumber;

    @FindBy(how = How.ID, using = "Industry")
    public WebElement select_industry;

    @FindBy(how = How.ID, using = "MktoPersonNotes")
    public WebElement input_message;
    //FirstName
}
