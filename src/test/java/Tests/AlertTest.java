package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.AlertsPage;

public class AlertTest extends BaseTest {
    @Test
    public void checkAlertTextTest() {
        String text = "I am a JS Alert";
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.clickAlertButton();
        String text_actual = alertsPage.switchAndGetAlert();
        alertsPage.acceptAlert();
        Assert.assertEquals(text_actual, text, "text of alert doesn't meet condition");
    }

    @Test
    public void checkAlertConfirmTextTest() {
        String text = "I am a JS Confirm";
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.clickAlertConfirmButton();
        String text_actual = alertsPage.switchAndGetAlert();
        alertsPage.dismissAlert();
        Assert.assertEquals(text_actual, text, "text of alert doesn't meet condition");
    }

    @Test
    public void checkAlertPromptTextTest() {
        String message = "Hi. Spring is near";
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.clickAlertPromptButton();
        alertsPage.switchAndSendTextAlert(message);
        alertsPage.acceptAlert();
        Assert.assertTrue(alertsPage.receiveResultMessage().contains(message), "text of alert doesn't meet condition");
    }
}