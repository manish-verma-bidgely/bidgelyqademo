package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static factory.WebDriverFactory.getWebDriver;


public class HomePage {


    @FindBy(className = "bidgely-icon-energy-insight")
    private WebElement energyInsightsBtn;

    public HomePage() {
        PageFactory.initElements(getWebDriver(), this);
    }


    public void clickOnEnergyInsights() {
        energyInsightsBtn.click();
    }
}
