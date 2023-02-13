package pagefactorypahes;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends BasePage {
    @FindBy(xpath = "//div[@id='draggable']")
    private WebElement draggable;
    @FindBy(xpath = "//div[@id='droppable']")
    private WebElement droppable;

    @FindBy(xpath = "//div[@id='droppable']/p")
    private WebElement text_actual;

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    public void openDroppablePage() {
        driver.get(Urls.REGISTER_FORM_URL_DROPP);
    }

    public void switchFrame() {
        driver.switchTo().frame(0);
    }

    public void moveAction() {
        Actions actions = new Actions(driver);
        actions
                .dragAndDrop(draggable, droppable)
                .build()
                .perform();
    }

    public String receiveText() {
        return text_actual.getText();
    }
}