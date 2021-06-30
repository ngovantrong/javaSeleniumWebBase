package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalConfig {
    public static String baseUrl = "https://translate.google.com";
    public static WebDriver driver = new ChromeDriver();
}
