package Tests;

import Tests.BaseTest;
import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.CheckBoxesPage;

public class CheckboxesTest extends BaseTest {
    @Test
    public void checkNotSelectCheckboxe1Test() {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);
        checkBoxesPage.openCheckBoxesPage();
        Assert.assertFalse(checkBoxesPage.isCheckbox1Selected(), "Checkbox active");
    }

    @Test
    public void checkSelectCheckboxe1Test() {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);
        checkBoxesPage.openCheckBoxesPage();
        checkBoxesPage.clickCheckbox1();
        Assert.assertTrue(checkBoxesPage.isCheckbox1Selected(), "Checkbox not active");
    }

    @Test
    public void checkSelectCheckboxe2Test() {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);
        checkBoxesPage.openCheckBoxesPage();
        Assert.assertTrue(checkBoxesPage.isCheckbox2Selected(), "Checkbox not active");
    }

    @Test
    public void checkNotSelectCheckboxe2Test() {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);
        checkBoxesPage.openCheckBoxesPage();
        checkBoxesPage.clickCheckbox2();
        Assert.assertFalse(checkBoxesPage.isCheckbox2Selected(), "Checkbox active");
    }
}