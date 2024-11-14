package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pagefactory.AddToCart;
import pagefactory.ProceedToBuy;

public class LoginStepDefinition {
    WebDriver driver;
    AddToCart loginPage;
    ProceedToBuy paymentPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new AddToCart(driver);
        paymentPage = new ProceedToBuy(driver);
        loginPage.openLoginPage();
    }

    @When("I enter my username {string} and password {string}")
    public void enterUsernameAndPassword(String username, String password) {
        loginPage.enterUsernameAndPassword(username, password);
    }

    @And("I search for the product {string}")
    public void i_search_for_the_product(String productName) {
        loginPage.searchProduct(productName);
    }

    @And("I select the product {string}")
    public void i_select_the_product(String product) {
        loginPage.selectProduct();
    }

    @Then("I add the product to the cart")
    public void i_add_the_product_to_the_cart() {
        loginPage.addToCart();
    }

    @Then("I click on the Go to cart")
    public void i_click_on_the_Go_to_cart() {
        paymentPage.clickGotoCartButton();
    }
    
    @Then("I click on continue")
    public void i_click_on_continue() {
        paymentPage.clickContinueButton();
    }

    @Then("I proceed to the summary screen")
    public void i_proceed_to_the_summary_screen() {
        paymentPage.clickOnSummaryButton();
    }
}
