package pagefactorypahes;

import constants.Urls;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddRemovePage extends BasePage {
    @FindBy(css = "button[onclick*='add']")
    private WebElement addElementButton;

    @FindBy(xpath = "//div[@id='elements']/button[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//div[@id='elements']/*")
    private List<WebElement> deletebuttons;

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    public void openAddRemovePage() {
        driver.get(Urls.REGISTER_FORM_URL_ADD);
    }

    public void clickAddButton() {
        addElementButton.click();
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }

    public int countDeleteButton() {
        return deletebuttons.size();
    }
}