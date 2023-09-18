package StepDefinitions;

import Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.driverFactory;

public class loginStepDefinitions {

    WebDriver driver = driverFactory.getDriver();
    loginPage pages = new loginPage(driver);
    @Given("Go to instagram")
    public void goToInstagram() throws InterruptedException {
        pages.homePage();

    }

    @When("Enter nickname and password")
    public void enterNicknameAndPassword() throws InterruptedException {
        pages.nickNameAndPassword();
    }

    @When("Click the login button")
    public void clickTheLoginButton() throws InterruptedException {
        pages.loginButton();
    }

    @When("Click the not now button")
    public void clickTheNotNowButton() throws InterruptedException {
        pages.clickNotNow();
    }

    @Then("Check login")
    public void checkLogin() {
        pages.check();
    }

}
