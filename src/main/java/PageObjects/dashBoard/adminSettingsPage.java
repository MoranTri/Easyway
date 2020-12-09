package PageObjects.dashBoard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class adminSettingsPage
{
    @FindBy(how = How.XPATH, using = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 MuiGrid-item MuiGrid-align-items-xs-center MuiGrid-grid-xs-12']//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-align-items-xs-center MuiGrid-justify-xs-flex-end MuiGrid-grid-xs-1']")
    public List<WebElement> list_checkboxs;
}
