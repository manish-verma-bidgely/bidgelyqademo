package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static factory.WebDriverFactory.getWebDriver;

public class SeleniumUtils {
    public static void sleepInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }


    private static void sleepInSeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.border='2px solid cyan';", element);
        sleepInSeconds(1);
    }

    public static void unhighlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.border='';", element);
    }


    public static void inputText(WebElement element, String text) {
        if (element != null && element.isDisplayed() && element.isEnabled()) {
            highlight(getWebDriver(), element);
            element.clear();
            element.sendKeys(text);
            unhighlight(getWebDriver(), element);
        } else {
            throw new IllegalArgumentException("Element is not interactable");
        }
    }
}
