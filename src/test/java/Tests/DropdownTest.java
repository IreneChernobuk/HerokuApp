package Tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.DropdownPage;

public class DropdownTest extends BaseTest {

    @Test
    public void selectFirstOptionTest() {
        DropdownPage dropdown = new DropdownPage(driver);
        dropdown.openDropdownPage();
        Select select = new Select(dropdown.getSelect());
        select.getFirstSelectedOption();
        Assert.assertTrue(dropdown.isOption1Selected(), "Option 1 isn't selected");
    }

    @Test
    public void selectSecondOptionTest() {
        DropdownPage dropdown = new DropdownPage(driver);
        dropdown.openDropdownPage();
        Select select = new Select(dropdown.getSelect());
        select.selectByValue("1");
        Assert.assertTrue(dropdown.isOption2Selected(), "Option 1 isn't selected");
    }

    @Test
    public void selectThirdOptionTest() {
        DropdownPage dropdown = new DropdownPage(driver);
        dropdown.openDropdownPage();
        Select select = new Select(dropdown.getSelect());
        select.selectByValue("2");
        Assert.assertTrue(dropdown.isOption3Selected(), "Option 1 isn't selected");
    }
}