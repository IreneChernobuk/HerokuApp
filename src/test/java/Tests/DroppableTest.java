package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.DroppablePage;

public class DroppableTest extends BaseTest {
    @Test
    public void actionTest() {
        DroppablePage droppablePage = new DroppablePage(driver);
        droppablePage.openDroppablePage();
        WebDriver frame = driver.switchTo().frame(0);
        Actions actions = new Actions(driver);
        actions
                .dragAndDrop(droppablePage.getDraggable(), droppablePage.getDroppable())
                .build()
                .perform();
        Assert.assertEquals(droppablePage.receiveText(), "Dropped!", "messages are different");
    }
}