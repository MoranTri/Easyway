package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class contactUsPage
{
    @FindBy(how = How.XPATH, using = "//div[@id='comp-k8x0nwmn']//h4[@class='font_4']")
    public WebElement txt_contactUsTitle;

    @FindBy(how = How.NAME, using = "full-name")
    public WebElement input_fullName;

    @FindBy(how = How.ID, using = "input_comp-k8x0dzye")
    public WebElement input_email;

    @FindBy(how = How.ID, using = "input_comp-k8x0hiij")
    public WebElement input_hotelName;

    @FindBy(how = How.ID, using = "textarea_comp-k8x0dzym")
    public WebElement input_howCanWeHelpYou;
}
