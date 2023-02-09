package Tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.DroppablePage;

public class DroppableTest extends BaseTest {
    @Test
    public void actionTest() {
        DroppablePage droppablePage = new DroppablePage(driver);
        droppablePage.openDroppablePage();
        Actions actions = new Actions(driver);
        actions
                .dragAndDrop(droppablePage.getDraggable(), droppablePage.getDroppable())
                .build()
                .perform();
        droppablePage.switchFrame();
        Assert.assertEquals(droppablePage.receiveText(), "Dropped!", "messages are different");
    }
}