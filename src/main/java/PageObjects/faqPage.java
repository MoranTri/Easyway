package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class faqPage
{
    @FindBy(how = How.CSS, using = "h1")
    public WebElement txt_faqPageTitle;

    @FindBy(how = How.XPATH, using = "//dl[@class='faq']//dt")
    public List<WebElement> list_questions;

    @FindBy(how = How.XPATH, using = "//dl[@class='faq']//dd//div")
    public List<WebElement> list_answers;
}
