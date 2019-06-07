package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicTest {

    @Test
    public void FirstTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://translate.google.com/?hl=vi&tab=TT&authuser=0");
        driver.manage().window().maximize();
        driver.close();
        driver.quit();
    }
}
