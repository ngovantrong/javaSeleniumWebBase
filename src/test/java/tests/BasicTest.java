package tests;

import PageObjects.TranslatePage;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.GlobalConfig;

public class BasicTest {
    GlobalConfig appConf = new GlobalConfig();

    @BeforeSuite
    public void BeforeSuite() throws InterruptedException {
        System.out.println("This is before suite");
        GlobalConfig.driver.get(GlobalConfig.baseUrl);
        GlobalConfig.driver.manage().window().maximize();
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("This is after suite");
        GlobalConfig.driver.close();
        GlobalConfig.driver.quit();
    }

    @Test
    public void FirstTest() {
        System.out.println("This is the first test");
        Assert.assertTrue(Boolean.TRUE);
    }

    @Test
    public void SecondTest() {
        System.out.println("This is a failed test");
        Assert.assertTrue(Boolean.FALSE);
    }

    /**
     * Description : This test is to check the translate work
     * Test Procedure :
     *      1. input string to translate
     * Expected result :
     *      2. inputted string will be translated successfully
     */
    @Test
    public void Translate() throws Exception {
        TranslatePage.translate("just to test", "just to test");
    }
}
