package pagefactorypahes;

import constants.Urls;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsPage extends BasePage {
    @FindBy(css = "[type=number]")
    private WebElement input;

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage() {
        driver.get(Urls.REGISTER_FORM_URL_INPUTS);
    }

    public void clickArrowUp(int counterClick) {
        for (int i = 0; i < counterClick; i++) {
            input.sendKeys(Keys.ARROW_UP);
        }
    }

    public void clickArrowDown(int counterClick) {
        for (int i = 0; i < counterClick; i++) {
            input.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public String receiveNumbers() {
        return input.getAttribute("value");
    }

    public void sendInput(String value) {
        input.sendKeys(value);
    }
}