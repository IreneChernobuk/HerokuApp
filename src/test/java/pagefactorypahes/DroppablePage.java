package pagefactorypahes;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends BasePage {
    @FindBy(xpath = "//div[@id='draggable']")
    private WebElement draggable;
    @FindBy(xpath = "//div[@id='droppable']")
    private WebElement droppable;

    @FindBy(xpath = "//div[@id='droppable']/p")
    private WebElement text_actual;

    @FindBy(css = "..demo-frame")
    private WebElement frame1;

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getDraggable() {
        return draggable;
    }

    public WebElement getDroppable() {
        return droppable;
    }

    public void openDroppablePage() {
        driver.get(Urls.REGISTER_FORM_URL_DROPP);
    }

    public String receiveText() {
        return text_actual.getText();
    }
}