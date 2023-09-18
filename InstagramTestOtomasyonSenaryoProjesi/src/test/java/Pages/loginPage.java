package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.elementHelper;

import java.time.Duration;

public class loginPage {
    static WebDriver driver;
    static elementHelper helper;
    WebDriverWait wait;


    static By username = By.xpath("//input[@name = \"username\"]");

    static By password = By.xpath("//input[@name = \"password\"]");

    static By clickLoginButton = By.xpath("//button[@class = \"_acan _acap _acas _aj1-\"]");

    static By notNow = By.xpath("//div[@class = \"_ac8f\"]");

    static By turnDownTheNotifications = By.xpath("//button[@class = \"_a9-- _a9_1\"]");

    static By checkElementt = By.xpath("//a[@class = \"x1i10hfl xjbqb8w x6umtig x1b1mbwd xaqea5y xav7gou x9f619 x1ypdohk xt0psk2 xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x16tdsg8 x1hl2dhg xggy1nq x1a2a7pz _aak1 _a6hd\" and @class = contains(text(),\"hayri_sirek\")]");

    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.helper = new elementHelper(driver);

    }
    public void homePage() throws InterruptedException {
        Thread.sleep(3000);
    }


    public void nickNameAndPassword() throws InterruptedException {
        helper.click(username);
        helper.sendKeys(username, "Kullanıcı Adı Giriniz!");
        helper.click(password);
        helper.sendKeys(password, "Şifrenizi Giriniz!");
        Thread.sleep(3000);

    }

    public void loginButton() throws InterruptedException {
        helper.click(clickLoginButton);
        Thread.sleep(8000);
    }

    public void clickNotNow() throws InterruptedException {
        helper.click(notNow);
        Thread.sleep(7000);
        helper.click(turnDownTheNotifications);
        Thread.sleep(5000);
    }

    public void check() {
      helper.checkElement(checkElementt);
    }


}