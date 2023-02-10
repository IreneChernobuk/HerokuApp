package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.DroppablePage;

public class DroppableTest extends BaseTest {
    @Test
    public void actionTest() {
        DroppablePage droppablePage = new DroppablePage(driver);
        droppablePage.openDroppablePage();
        droppablePage.switchFrame();
        droppablePage.moveAction();
        Assert.assertEquals(droppablePage.receiveText(), "Dropped!", "messages are different");
    }
}