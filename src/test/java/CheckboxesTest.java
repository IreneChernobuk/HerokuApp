import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {
    @Test
    public void checkNotSelectCheckboxe1() {
        driver.get(Urls.REGISTER_FORM_URL_CHECK);
        WebElement element = driver.findElement(By.xpath("//form/input[1]"));
        boolean checkboxNotSelected = element.isSelected();
        Assert.assertFalse(checkboxNotSelected, "Checkbox active");
    }

    @Test
    public void checkSelectCheckboxe1() {
        driver.get(Urls.REGISTER_FORM_URL_CHECK);
        WebElement element = driver.findElement(By.xpath("//form/input[1]"));
        element.click();
        boolean checkboxSelected = element.isSelected();
        Assert.assertTrue(checkboxSelected, "Checkbox not active");
    }

    @Test
    public void checkSelectCheckboxe2() {
        driver.get(Urls.REGISTER_FORM_URL_CHECK);
        WebElement element = driver.findElement(By.xpath("//form/input[2]"));
        boolean checkboxSelected = element.isSelected();
        Assert.assertTrue(checkboxSelected, "Checkbox not active");
    }

    @Test
    public void checkNotSelectCheckboxe2() {
        driver.get(Urls.REGISTER_FORM_URL_CHECK);
        WebElement element = driver.findElement(By.xpath("//form/input[2]"));
        element.click();
        boolean checkboxNotSelected = element.isSelected();
        Assert.assertFalse(checkboxNotSelected, "Checkbox active");
    }
}
