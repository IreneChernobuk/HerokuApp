package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypahes.UploadPage;

public class UploadTest extends BaseTest{
    @Test
    public void inspectUploadFileTest(){
        String file_name = "panda.jpg";
        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.openUploadPage();
        uploadPage.uploadFife();
        uploadPage.clickUploadButton();
        Assert.assertEquals(uploadPage.receiveNameUnloadFile(), file_name, "names are different");
    }
}
