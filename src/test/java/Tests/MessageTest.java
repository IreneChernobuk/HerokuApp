package Tests;

import Tests.BaseTest;
import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.MessagePage;

public class MessageTest extends BaseTest {
    @Test
    public void inspectNotMessageTest() {
        String text = "Action successful\n×";
        MessagePage messagePage = new MessagePage(driver);
        messagePage.openMessagePage();
        messagePage.clickLink();
        Assert.assertEquals(messagePage.receiceMessage(), text, "there is an error in the message");
    }
}