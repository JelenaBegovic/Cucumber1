package Steps;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefinition{

    public static WebDriver driver;
    public LoginPage loginPage;
    public SecureAreaPage secureAreaPage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage();
        secureAreaPage = new SecureAreaPage();
    }

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

    @When("User inputs username")
    public void userInputsUsername() {
        loginPage.inputUsername("tomsmith");
    }

    @And("User inputs password")
    public void userInputsPassword() {
        loginPage.inputPassword("SuperSecretPassword!");
    }

    @And("User clicks on Login button")
    public void userClicksOnLoginButton() {
        loginPage.clickOnLoginButton();
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
        Assert.assertTrue(secureAreaPage.logoutButton.isDisplayed());
    }
}
