package PageObjects;

import org.openqa.selenium.By;
import utils.Common;
import utils.GlobalConfig;

public class TranslatePage {
    public static By inputTextBox = By.xpath("//textarea[@aria-label=\"Source text\"]");
    public static String spanTextReplace = "//span[text() = \"textToReplace\"]";

    public static void translate(String inputText, String expectedText) throws Exception {
        Common.inputText(TranslatePage.inputTextBox, inputText, GlobalConfig.globalTimeout);
        String translatedText = spanTextReplace.replace("textToReplace", inputText);
        Common.checkElementVisible(By.xpath(translatedText), GlobalConfig.globalTimeout);
    }
}
