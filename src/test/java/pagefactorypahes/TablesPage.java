package pagefactorypahes;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TablesPage extends BasePage {
    @FindBy(xpath = "//table[@id='table1']/tbody/tr[2]/td[1]")
    private WebElement lastName;
    @FindBy(xpath = "//table[@id='table1']/tbody/tr[2]/td[2]")
    private WebElement firstName;
    @FindBy(xpath = "//tbody/tr[2]/td[@class='dues']")
    private WebElement due;
    @FindBy(xpath = "//tbody/tr[2]/td[@class='web-site']")
    private WebElement website;

    public TablesPage(WebDriver driver) {
        super(driver);
    }

    public void openTablesPage() {
        driver.get(Urls.REGISTER_FORM_URL_TABLE);
    }

    public String receiveLastName() {
        return lastName.getText();
    }

    public String receiveFirstName() {
        return firstName.getText();
    }

    public String receiveDue() {
        return due.getText();
    }

    public String receiveWebSite() {
        return website.getText();
    }
}