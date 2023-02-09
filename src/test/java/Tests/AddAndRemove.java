package Tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.AddRemovePage;

public class AddAndRemove extends BaseTest {

    @Test
    public void addAndDeleteTest() {
        AddRemovePage addRemovePage = new AddRemovePage(driver);
        addRemovePage.openAddRemovePage();
        addRemovePage.clickAddButton();
        addRemovePage.clickAddButton();
        addRemovePage.clickDeleteButton();
        int element = addRemovePage.countDeleteButton();
        Assert.assertEquals(element, 1, "Button 'delete' consist more than 1");
    }
}