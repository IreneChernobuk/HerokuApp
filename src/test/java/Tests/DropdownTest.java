package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.DropdownPage;

public class DropdownTest extends BaseTest {

    @Test
    public void selectFirstOptionTest() {
        DropdownPage dropdown = new DropdownPage(driver);
        dropdown.openDropdownPage();
        dropdown.goToOption1();
        Assert.assertTrue(dropdown.isOption1Selected(), "Option 1 isn't selected");
    }

    @Test
    public void selectSecondOptionTest() {
        DropdownPage dropdown = new DropdownPage(driver);
        dropdown.openDropdownPage();
        dropdown.goToOption2();
        Assert.assertTrue(dropdown.isOption2Selected(), "Option 1 isn't selected");
    }

    @Test
    public void selectThirdOptionTest() {
        DropdownPage dropdown = new DropdownPage(driver);
        dropdown.openDropdownPage();
        dropdown.goToOption3();
        Assert.assertTrue(dropdown.isOption3Selected(), "Option 1 isn't selected");
    }
}