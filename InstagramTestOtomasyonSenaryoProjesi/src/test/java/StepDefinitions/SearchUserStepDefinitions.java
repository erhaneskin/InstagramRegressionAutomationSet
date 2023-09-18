package StepDefinitions;

import Pages.SearchUserPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.driverFactory;

public class SearchUserStepDefinitions {

    WebDriver driver = driverFactory.getDriver();

    SearchUserPage pages = new SearchUserPage(driver);
    @When("Click on the search button")
    public void clickOnTheSearchButton() throws InterruptedException {
        pages.clickSearchButton();
    }

    @When("Search user")
    public void searchUser() throws InterruptedException {
        pages.search();
    }

    @When("Click on the user")
    public void clickOnTheUser() {
        pages.clickUser();
    }

    @Then("Check the user")
    public void checkTheUser() {
        pages.check();
    }
}
