package StepDefinitions;

import Pages.SharePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.driverFactory;

public class ShareStepDefinitions {
    WebDriver driver = driverFactory.getDriver();
    SharePage pages = new SharePage(driver);
    @When("Share a post any instagram follower")
    public void shareAPostAnyInstagramFollower() throws InterruptedException {
        pages.sharePost();
    }

    @Then("Check the post")
    public void checkThePost() throws InterruptedException {
        pages.checkPost();
    }
}
