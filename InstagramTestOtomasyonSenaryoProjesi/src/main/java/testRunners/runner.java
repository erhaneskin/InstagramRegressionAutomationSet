package testRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import util.driverFactory;

@CucumberOptions(
        features = {"C:\\Users\\ACER\\IdeaProjects\\InstagramTestOtomasyonSenaryoProjesi\\src\\test\\java\\Features\\likePost.feature"},
        glue = {"StepDefinitions", "util"},
        tags = "",
        plugin = {
                "summary", "pretty","html:Reports/CucumberReport/Reports.html"
        }
)

public class runner extends AbstractTestNGCucumberTests {

    static WebDriver driver = driverFactory.getDriver();
}
