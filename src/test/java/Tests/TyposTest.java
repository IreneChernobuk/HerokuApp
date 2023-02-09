package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.TyposPage;

public class TyposTest extends BaseTest {
    @Test
    public void inspectTextTest() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        String textLine1 = "This example demonstrates a typo being introduced. It does it randomly on each page load.";
        String textLine2 = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(typosPage.receiveTextLine1(), textLine1, "there is an error in the text");
        Assert.assertEquals(typosPage.receiveTextLine2(), textLine2, "there is an error in the text");
    }
}