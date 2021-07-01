package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
    public static void clickElement(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(GlobalConfig.driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));

        GlobalConfig.driver.findElement(element).click();
    }

    public static void inputText(By element, String text, int timeout) {
        WebDriverWait wait = new WebDriverWait(GlobalConfig.driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

        WebElement webElement = GlobalConfig.driver.findElement(element);
        webElement.clear();
        webElement.sendKeys(text);
    }

    public static void checkElementVisible (By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(GlobalConfig.driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
