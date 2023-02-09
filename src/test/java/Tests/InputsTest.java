package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.InputsPage;

public class InputsTest extends BaseTest {
    @Test
    public void enterNumbersUpTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.clickArrowUp(3);
        Assert.assertEquals(inputsPage.receiveNumbers(), "3", "error in providing a value");
    }

    @Test
    public void enterNumbersDownTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.clickArrowDown(4);
        Assert.assertEquals(inputsPage.receiveNumbers(), "-4", "error in providing a value");
    }

    @Test
    public void enterNumbersRandomTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        String value = FakerMessageGenerate.generateValue();
        inputsPage.sendInput(value);
        Assert.assertEquals(inputsPage.receiveNumbers(), value, "error in providing a value");
    }
}