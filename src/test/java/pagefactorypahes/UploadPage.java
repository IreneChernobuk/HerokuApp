package pagefactorypahes;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends BasePage {
    @FindBy(id = "file-upload")
    private WebElement fileButton;
    @FindBy(id = "file-submit")
    private WebElement uploadButton;
    @FindBy(id = "uploaded-files")
    private WebElement nameUploadFile;

    public UploadPage(WebDriver driver) {
        super(driver);
    }

    public void openUploadPage() {
        driver.get(Urls.REGISTER_FORM_URL_UPLOAD);
    }

    public void uploadFife() {
        fileButton.sendKeys("C:\\Users\\Nout\\IdeaProjects\\HerokuApp\\src\\test\\resources\\panda.jpg");
    }

    public void clickUploadButton() {
        uploadButton.click();
    }

    public String receiveNameUnloadFile() {
        return nameUploadFile.getText();
    }
}