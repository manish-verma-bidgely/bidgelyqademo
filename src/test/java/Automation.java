import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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
}
