package pagefactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
    WebDriver driver;
    WebDriverWait wait;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // Login Page Elements
    @FindBy(id = "userData")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(xpath = "//button[normalize-space()='LOGIN']")
    WebElement loginButton;

    // Search and Product Selection Elements
    @FindBy(xpath = "//input[@class='text-black']")
    WebElement searchBox;

    @FindBy(xpath = "//p[normalize-space()='OnePlus Nord CE 4 Lite 5G ( Mega Blue, 8GB-256GB )']")
    WebElement productLink;

    @FindBy(xpath = "//button[normalize-space()='Add To Cart']")
    WebElement addToCartButton;

    public void openLoginPage() {
        driver.get("https://www.poorvika.com/orders");
    }

    public void enterUsernameAndPassword(String username, String password) {
        wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void searchProduct(String productName) {
        wait.until(ExpectedConditions.visibilityOf(searchBox)).sendKeys(productName);
    }

    public void selectProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(productLink)).click();
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
    }

    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }
}
