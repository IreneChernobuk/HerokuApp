package pagefactorypahes;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {
    @FindBy(id = "dropdown")
    private WebElement select_element;
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
        return select_element;
    }

    public void openDropdownPage() {
        driver.get(Urls.REGISTER_FORM_URL_DROPDOWN);
    }

    public void goToOption1() {
        Select select = new Select(select_element);
        select.getFirstSelectedOption();
    }

    public void goToOption2() {
        Select select = new Select(select_element);
        select.selectByValue("1");
    }

    public void goToOption3() {
        Select select = new Select(select_element);
        select.selectByValue("2");
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