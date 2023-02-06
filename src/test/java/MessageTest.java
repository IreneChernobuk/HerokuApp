import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageTest extends BaseTest {
    @Test
    public void inspectNotMessageTest() {
        String text = "Action successful\n×";
        driver.get(Urls.REGISTER_FORM_URL_NOTMES);
        driver.findElement(By.cssSelector("a[href=\"/notification_message\"]")).click();
        String textActual = driver.findElement(By.id("flash")).getText();
        System.out.println(textActual);
        Assert.assertEquals(textActual, text, "there is an error in the message");
    }
}