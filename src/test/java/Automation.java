import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static factory.WebDriverFactory.getWebDriver;
import static utils.SeleniumUtils.inputText;
import static utils.SeleniumUtils.sleepInSeconds;

public class Automation {

    @Test
    public void launchBrowser() {
        WebDriver driver = getWebDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        inputText(firstName, "John");
        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        inputText(lastName, "Doe");
        WebElement address = driver.findElement(By.tagName("textarea"));
        inputText(address, "123 Main St, Springfield, USA");
        sleepInSeconds(2);
        driver.quit();
    }


    @Test
    public void launchIRCTC() {
        WebDriver driver = getWebDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        sleepInSeconds(5);
        List<WebElement> elements = driver.findElements(By.className("ui-inputtext"));
        System.out.println(elements.get(0).getText());
        elements.get(0).click();
        elements.get(0).sendKeys("RNC");
        sleepInSeconds(1);
        driver.findElements(By.className("ui-autocomplete-list-item")).get(0).click();
        elements.get(1).click();
        elements.get(1).sendKeys("BJU");
        sleepInSeconds(1);
        driver.findElements(By.className("ui-autocomplete-list-item")).get(0).click();

        driver.findElement(By.id("journeyQuota")).click();
        // xpath with aria label TATKAL
        driver.findElement(By.xpath("//li[@aria-label='TATKAL']")).click();
        sleepInSeconds(5);
        driver.findElement(By.className("search_btn")).click();
        sleepInSeconds(5);
        driver.quit();

//        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//        inputText(firstName, "John");
//        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
//        inputText(lastName, "Doe");
//        WebElement address = driver.findElement(By.tagName("textarea"));
//        inputText(address, "123 Main St, Springfield, USA");
//        sleepInSeconds(2);
//        driver.quit();
    }
}
