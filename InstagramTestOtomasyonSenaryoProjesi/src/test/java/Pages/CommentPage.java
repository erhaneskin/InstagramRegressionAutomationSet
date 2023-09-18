package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.elementHelper;

import java.time.Duration;


public class CommentPage {

    static WebDriver driver;

    WebDriverWait wait;

    static elementHelper helper;

    static By comment = By.cssSelector("div.xw7yly9>:nth-child(2)>:first-child>:nth-child(3)>:first-child>:first-child>:first-child>:nth-child(3)>:first-child>:first-child>:nth-child(5)>:first-child>:first-child>:first-child>:first-child>:nth-child(2)");
    static By shareButton = By.cssSelector("div._aidp>:first-child");

    static By checkComment = By.xpath("//span[@class = \"_aacl _aaco _aacu _aacx _aad7 _aade\" and @class = contains(text(),\"Bu bir otomasyon yorumudur.\")]");

    public CommentPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.helper = new elementHelper(driver);

    }
    public void writeComment() throws InterruptedException {
       helper.click(comment);
       helper.sendKeys(comment,"Bu bir otomasyon yorumudur.");
       Thread.sleep(5000);
       helper.click(shareButton);

    }

    public void checkComment() {
        helper.checkElement(checkComment);
    }
}
