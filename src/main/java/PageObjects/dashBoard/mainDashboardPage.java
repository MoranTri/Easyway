package PageObjects.dashBoard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainDashboardPage
{
    @FindBy(how = How.ID, using = "drawer-item-admin")
    public WebElement btn_sidebarAdmin;
}
