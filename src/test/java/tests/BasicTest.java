package tests;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import org.testng.Assert;
import org.testng.annotations.*;
import sun.font.TrueTypeFont;
import utils.GlobalConfig;

public class BasicTest {

    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("This is before suite");
//        GlobalConfig.driver.get(GlobalConfig.baseUrl);
//        GlobalConfig.driver.manage().window().maximize();
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("This is after suite");
//        GlobalConfig.driver.close();
//        GlobalConfig.driver.quit();
    }

    @Test
    public void FirstTest() {
        System.out.println("This is the first test");
        Assert.assertTrue(Boolean.TRUE);
    }

    @Test
    public void AFailedTest() {
        System.out.println("This is the a failed test");
        Assert.assertTrue(Boolean.FALSE);
    }
}
