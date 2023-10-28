package Pages;

import Steps.StepDefinition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecureAreaPage extends StepDefinition {
    public SecureAreaPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "flash")
    public WebElement message;

    public String getMessage() {
        return message.getText();
    }

    @FindBy (css = ".icon-2x.icon-signout")
    public WebElement logoutButton;

    public void clickOnLogoutButton() {
        logoutButton.click();
    }
}