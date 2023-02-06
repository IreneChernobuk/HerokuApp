import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {
    @Test
    public void enterNumbersUpTest() {
        driver.get(Urls.REGISTER_FORM_URL_INPUTS);
        WebElement element = driver.findElement(By.cssSelector("[type=number]"));
        element.sendKeys(Keys.ARROW_UP);
        element.sendKeys(Keys.ARROW_UP);
        element.sendKeys(Keys.ARROW_UP);
        String number = element.getAttribute("value");
        Assert.assertEquals(number, "3", "error in providing a value");
    }

    @Test
    public void enterNumbersDownTest() {
        driver.get(Urls.REGISTER_FORM_URL_INPUTS);
        WebElement element = driver.findElement(By.cssSelector("[type=number]"));
        element.sendKeys(Keys.ARROW_DOWN); //-1
        element.sendKeys(Keys.ARROW_DOWN); //-2
        element.sendKeys(Keys.ARROW_DOWN); //-3
        element.sendKeys(Keys.ARROW_DOWN); //-4
        String number = element.getAttribute("value");
        Assert.assertEquals(number, "-4", "error in providing a value");
    }

    @Test
    public void enterNumbersRandomTest() {
        driver.get(Urls.REGISTER_FORM_URL_INPUTS);
        WebElement element = driver.findElement(By.cssSelector("[type=number]"));
        String value = FakerMessageGenerate.generateValue();
        element.sendKeys(value);
        String number = element.getAttribute("value");
        Assert.assertEquals(number, value, "error in providing a value");
    }
}