package pagefactorypahes;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {
    @FindBy(css = "[onclick='jsAlert()']")
    private WebElement alertButton;
    @FindBy(css = "[onclick='jsConfirm()']")
    private WebElement confirmButton;
    @FindBy(css = "[onclick='jsPrompt()']")
    private WebElement promptButton;
    @FindBy(id = "result")
    private WebElement result_message;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertPage() {
        driver.get(Urls.REGISTER_FORM_URL_ALERT);
    }

    public void clickAlertButton() {
        alertButton.click();
    }

    public void clickAlertConfirmButton() {
        confirmButton.click();
    }

    public void clickAlertPromptButton() {
        promptButton.click();
    }

    public String switchAndGetAlert() {
        return driver.switchTo().alert().getText();
    }

    public void switchAndSendTextAlert(String message) {
        driver.switchTo().alert().sendKeys(message);
    }

    public String receiveResultMessage() {
        return result_message.getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }
}