import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuTables_Test extends BaseTest {
    @Test
    public void checkLastNameConditionTest() {
        driver.get(Urls.REGISTER_FORM_URL_TABLE);
        String Last_Name = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[1]")).getText();
        Assert.assertEquals(Last_Name, "Bach", "Last name doesn't meet condition");
    }

    @Test
    public void checkFirstNameConditionTest() {
        driver.get(Urls.REGISTER_FORM_URL_TABLE);
        String First_Name = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[2]")).getText();
        Assert.assertEquals(First_Name, "Frank", "First name doesn't meet condition");
    }

    @Test
    public void checkDueConditionTest() {
        driver.get(Urls.REGISTER_FORM_URL_TABLE);
        String Due_cost = driver.findElement(By.xpath("//tbody/tr[2]/td[@class='dues']")).getText();
        Assert.assertEquals(Due_cost, "$51.00", "due doesn't meet condition");
    }

    @Test
    public void checkWebSiteConditionTest() {
        String webSite = "http://www.frank.com";
        driver.get(Urls.REGISTER_FORM_URL_TABLE);
        String webSite_actual = driver.findElement(By.xpath("//tbody/tr[2]/td[@class='web-site']")).getText();
        Assert.assertEquals(webSite_actual, webSite, "web-site doesn't meet condition");
    }
}