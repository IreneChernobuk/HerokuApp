package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.TablesPage;

public class HerokuTables_Test extends BaseTest {
    @Test
    public void checkLastNameConditionTest() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        Assert.assertEquals(tablesPage.receiveLastName(), "Bach", "Last name doesn't meet condition");
    }

    @Test
    public void checkFirstNameConditionTest() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        Assert.assertEquals(tablesPage.receiveFirstName(), "Frank", "First name doesn't meet condition");
    }

    @Test
    public void checkDueConditionTest() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        Assert.assertEquals(tablesPage.receiveDue(), "$51.00", "due doesn't meet condition");
    }

    @Test
    public void checkWebSiteConditionTest() {
        String webSite = "http://www.frank.com";
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        Assert.assertEquals(tablesPage.receiveWebSite(), webSite, "web-site doesn't meet condition");
    }
}