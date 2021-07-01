package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalConfig {
    public static String baseUrl = "https://translate.google.com";
    public static WebDriver driver;
    public static int globalTimeout = 5;

    public GlobalConfig() {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }
}
