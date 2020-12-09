package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage
{
    @FindBy(how = How.CSS, using = "h2")
    public WebElement txt_loginTitle;

    @FindBy(how = How.CSS, using = "input[type='text']")
    public WebElement input_email;

    @FindBy(how = How.CSS, using = "input[type='password']")
    public WebElement input_password;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    public WebElement btn_login;
}
