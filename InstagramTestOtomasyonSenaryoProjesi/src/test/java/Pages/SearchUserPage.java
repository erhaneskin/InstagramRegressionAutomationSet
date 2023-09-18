package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.elementHelper;

import java.time.Duration;

public class SearchUserPage {
    static WebDriver driver;
    WebDriverWait wait;
    static elementHelper helper;

    static By searchButton = By.cssSelector("div.xh8yej3.x1iyjqo2>:nth-child(2)>:first-child");

    static By writeUserName = By.xpath("//input[contains(@aria-label,'Search')]");

    static By findUser = By.xpath("//div[@class = \"x9f619 x78zum5 xdt5ytf x1iyjqo2 x6ikm8r x1odjw0f xh8yej3 xocp1fn\"]//a[1]");

    static By checkUser = By.xpath("//header[@class = \"x1qjc9v5 x78zum5 x1q0g3np x2lah0s x1n2onr6 x1qsaojo xc2v4qs x1xl8k2i x1ez9qw7 x1kcpa7z\"]//section[1]//div[1]//h2");

    public SearchUserPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.helper = new elementHelper(driver);

    }


    public void clickSearchButton() throws InterruptedException {
        helper.click(searchButton);
        Thread.sleep(2000);
    }

    public void search() throws InterruptedException {
        helper.click(writeUserName);
        Thread.sleep(2000);
        helper.sendKeys(writeUserName, "ashtburd");
        Thread.sleep(2000);
    }

    public void clickUser() {
        helper.click(findUser);
    }

    public void check() {
        helper.checkElement(checkUser);
    }
}
