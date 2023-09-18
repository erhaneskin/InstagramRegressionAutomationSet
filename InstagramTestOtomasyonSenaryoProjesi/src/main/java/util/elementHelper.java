package util;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class elementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;
    private Exception NoSuchElementException;

    public elementHelper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.action = new Actions(driver);

    }

    public WebElement presenceElement(By key){
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public WebElement findElement(By key){
        WebElement element = presenceElement(key);
        return element;
    }

    public void click(By key){
        findElement(key).click();
    }

    public void sendKeys(By key, String text){
        findElement(key).sendKeys(text);
    }

    public void checkVisible(By key){
        wait.until(ExpectedConditions.visibilityOf(findElement(key)));
    }

    public void checkElement(By key){

        try{
            findElement(key);
        }catch(TimeoutException e){
            throw new RuntimeException("Belirtilen Element Belirtilen Süre İçerisinde Görünür Olarak Bulunumadı!");
        }

    }
}

