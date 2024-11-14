package pagefactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProceedToBuy {
    WebDriver driver;
    WebDriverWait wait;

    public ProceedToBuy(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // Elements
    @FindBy(xpath = "//button[normalize-space()='Go To Cart']")
    WebElement goToCart;

    @FindBy(xpath = "//button[@class='button bg-blue-500 hover:bg-blue-700 text-white font-bold py-3 px-6 width:auto undefined button--green-gradient button_button--green-gradient__dYW6_ button_btnClass__TjSbM false']")
    WebElement continueButton;

    @FindBy(css = "button[class='button bg-blue-500 hover:bg-blue-700 text-white font-bold py-3 px-6 width:auto undefined button--green-gradient button_button--green-gradient__dYW6_ button_btnClass__TjSbM false']")
     WebElement proceedToPayButton;

    public void clickGotoCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(goToCart)).click();
    }

    public void clickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }

    public void clickOnSummaryButton() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedToPayButton)).click();
    }
}
