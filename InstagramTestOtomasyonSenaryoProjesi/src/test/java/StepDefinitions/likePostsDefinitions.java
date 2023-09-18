package StepDefinitions;

import Pages.likePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.driverFactory;

public class likePostsDefinitions {

    WebDriver driver = driverFactory.getDriver();
    likePage pages = new likePage(driver);

    @When("Like First Post")
    public void likeFirstPost() throws InterruptedException {
        pages.like();
    }

    @Then("Check Like")
    public void checkLike() {
        pages.check();
    }
}
