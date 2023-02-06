package pagefactorypahes;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TyposPage extends BasePage {
    @FindBy(xpath = "//div/p[1]")
    private WebElement textLine1;

    @FindBy(xpath = "//div/p[2]")
    private WebElement textLine2;

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage() {
        driver.get(Urls.REGISTER_FORM_URL_TYPOS);
    }

    public String receiveTextLine1() {
        return textLine1.getText();
    }

    public String receiveTextLine2() {
        return textLine2.getText();
    }
}