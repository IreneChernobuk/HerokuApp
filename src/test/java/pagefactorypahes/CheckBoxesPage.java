package pagefactorypahes;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxesPage extends BasePage {
    @FindBy(xpath = "//form/input[1]")
    private WebElement checkbox1;

    @FindBy(xpath = "//form/input[2]")
    private WebElement checkbox2;

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckBoxesPage() {
        driver.get(Urls.REGISTER_FORM_URL_CHECK);
    }

    public void clickCheckbox1() {
        checkbox1.click();
    }

    public void clickCheckbox2() {
        checkbox2.click();
    }

    public boolean isCheckbox1Selected() {
        return checkbox1.isSelected();
    }

    public boolean isCheckbox2Selected() {
        return checkbox2.isSelected();
    }
}