package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.elementHelper;

import java.time.Duration;

public class likePage {

    static WebDriver driver;
    static elementHelper helper;
    WebDriverWait wait;

    static By likeButton = By.cssSelector("div.xw7yly9>:nth-child(2)>:first-child>:nth-child(3)>:first-child>:first-child>:first-child>:nth-child(3)>:first-child>:first-child>:first-child>:first-child>:first-child");

    static By checkLike = By.xpath("//span[@class = \"x1ykxiw6 x1ahuga x4hg4is x3oybdh\"]");

    public likePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.helper = new elementHelper(driver);

    }

    public void like() throws InterruptedException {
        helper.click(likeButton);
        Thread.sleep(3000);
    }

    public void check() {
        helper.checkElement(checkLike);
    }
}
