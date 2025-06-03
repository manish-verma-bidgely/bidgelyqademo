import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;

import static factory.WebDriverFactory.getWebDriver;

public class DemoSeleniumTest {


    public static final String URL = "http://bhermp-nonprodqa.bidgely.com/dashboard?user-hash=1712772392113v1uqnF7Vh0kvlthetnCjKq0RgXFUhTIlnclM4NLhKNUVvkNJMMB95n34motr7sd_mahqoZVhmGQrNA2CS24Bzrfg==";

    @Test
    public void clickOnEnergyInsightIconTest() {
        getWebDriver().get(URL);
        sleepInSeconds(6000);
        new HomePage().clickOnEnergyInsights();
        sleepInSeconds(3000);


//        WebElement insightsHeader = driver.findElement(By.xpath("//div[@data-id='insights-usage-header']"));
//        assertTrue(insightsHeader.isDisplayed(), "Energy Insight page is not displayed");
    }

    public static void main(String[] args) {
        WebDriver driver = getWebDriver();
        driver.get("http://bhermp-nonprodqa.bidgely.com/dashboard?user-hash=1712772392113v1uqnF7Vh0kvlthetnCjKq0RgXFUhTIlnclM4NLhKNUVvkNJMMB95n34motr7sd_mahqoZVhmGQrNA2CS24Bzrfg==");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        sleepInSeconds(2000);
        sleepInSeconds(3000);
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        WebElement element = driver.findElement(By.className("bidgely-icon-energy-insight"));

        //Operation
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getSize());
        element.click();
//        driver.navigate().refresh();
        sleepInSeconds(6000);
        // chaining of methods
        driver.findElement(By.className("MuiSelect-select")).click();
        System.out.println(driver.findElements(By.tagName("li")).size());
        driver.findElements(By.tagName("li")).get(3).click();

        // Alternative way to select an option from a dropdown
//        Select select = new Select(driver.findElement(By.className("MuiSelect-select")));
//        select.selectByVisibleText("Heating");

        sleepInSeconds(6000);
        driver.quit();
    }

//    private static WebDriver getWebDriver() {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
//        return driver;
//    }


    // Shortcut to create method: option+ command + m
    // Shift+Fn+F6 to rename method
    // Duplicate line: command + D
    // Delete line: command + delete
    private static void sleepInSeconds(long milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
