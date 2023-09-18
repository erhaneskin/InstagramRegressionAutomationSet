package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.elementHelper;

import java.time.Duration;

public class SharePage {
    static WebDriver driver;
    WebDriverWait wait;
    static elementHelper helper;


    static By clickShareButton = By.xpath("//article[1]//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//button[1]");

    static By searchFollower = By.xpath("//input[contains(@placeholder,'Search')]");

    static By selectButton = By.xpath("//input[@name = \"ContactSearchResultCheckbox\"]");

    static By sendButton = By.xpath("//div[contains(text(),'Send')]");

    static By check = By.xpath("//p[contains(text(), 'Sent')]");
    public SharePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.helper = new elementHelper(driver);
    }

    public void sharePost() throws InterruptedException {
        helper.click(clickShareButton);
        Thread.sleep(3000);
        helper.click(searchFollower);
        Thread.sleep(3000);
        helper.sendKeys(searchFollower,"ashtburd");
        Thread.sleep(3000);
        helper.click(selectButton);
        Thread.sleep(5000);
        helper.click(sendButton);
    }

    public void checkPost() throws InterruptedException {
        helper.checkElement(check);
    }
}
