package StepDefinitions;

import Pages.CommentPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.driverFactory;

public class CommentStepDefinitions {

    WebDriver driver = driverFactory.getDriver();

    CommentPage pages = new CommentPage(driver);
    @When("Write a comment any instagram post")
    public void writeACommentAnyInstagramPost() throws InterruptedException {
        pages.writeComment();
    }

    @Then("Check the comment")
    public void checkTheComment() {
        pages.checkComment();
    }
}
