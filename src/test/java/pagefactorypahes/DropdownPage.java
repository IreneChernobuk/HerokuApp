package pagefactorypahes;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends BasePage {
    @FindBy(id = "dropdown")
    private WebElement select;
    @FindBy(css = "option:nth-child(1)")
    private WebElement option1;
    @FindBy(css = "option:nth-child(2)")
    private WebElement option2;
    @FindBy(css = "option:nth-child(3)")
    private WebElement option3;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSelect() {
        return select;
    }

    public void openDropdownPage() {
        driver.get(Urls.REGISTER_FORM_URL_DROPDOWN);
    }

    public boolean isOption1Selected() {
        return option1.isSelected();
    }

    public boolean isOption2Selected() {
        return option2.isSelected();
    }

    public boolean isOption3Selected() {
        return option3.isSelected();
    }
}