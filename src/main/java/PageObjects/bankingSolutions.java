package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class bankingSolutions
{
    @FindBy(how = How.CSS, using = "h1")
    public WebElement txt_bankingSolutionsTitle;

    @FindBy(how = How.CSS, using = ".tiny-bars > svg")
    public WebElement btn_playButton;

    @FindBy(how = How.CSS, using = "iframe[src='https://player.vimeo.com/video/483069754']")
    public WebElement iframe;
}
