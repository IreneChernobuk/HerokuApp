import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuApp extends BaseTest {
    @Test
    public void AddAndDeleteTest() {
        driver.get(Urls.REGISTER_FORM_URL_ADD);
        driver.findElement(By.cssSelector("button[onclick*='add']")).click();
        driver.findElement(By.cssSelector("button[onclick*='add']")).click();
        driver.findElement(By.xpath("//div[@id='elements']/button[1]")).click();
        int element = driver.findElements(By.xpath("//div[@id='elements']")).size();
        Assert.assertEquals(element, 1, "Button 'delete' consist more than 1");
    }
}