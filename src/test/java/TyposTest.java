import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTest extends BaseTest {
    @Test
    public void inspectTextTest() {
        driver.get(Urls.REGISTER_FORM_URL_TYPOS);
        String textLine1 = "This example demonstrates a typo being introduced. It does it randomly on each page load.";
        String textLine2 = "Sometimes you'll see a typo, other times you won't.";
        String textLine1_actual = driver.findElement(By.xpath("//div/p[1]")).getText();
        String textLine2_actual = driver.findElement(By.xpath("//div/p[2]")).getText();
        Assert.assertEquals(textLine1_actual, textLine1, "there is an error in the text");
        Assert.assertEquals(textLine2_actual, textLine2, "there is an error in the text");
    }
}