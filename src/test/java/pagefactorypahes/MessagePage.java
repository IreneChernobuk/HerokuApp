package pagefactorypahes;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagePage extends BasePage {
    @FindBy(css = "a[href=\"/notification_message\"]")
    private WebElement link;
    @FindBy(id = "flash")
    private WebElement text;

    public MessagePage(WebDriver driver) {
        super(driver);
    }

    public void openMessagePage() {
        driver.get(Urls.REGISTER_FORM_URL_NOTMES);
    }

    public void clickLink() {
        link.click();
    }

    public String receiceMessage() {
        return text.getText();
    }
}