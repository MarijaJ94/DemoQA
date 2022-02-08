package PagesDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LinksPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    // elementi
    WebElement created;
    WebElement noContent;
    WebElement moved;
    WebElement badRequest;
    WebElement unauthorized;
    WebElement forbiden;
    WebElement notFound;
    WebElement message;

    public LinksPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getCreated() {
        return driver.findElement(By.id("created"));
    }

    public WebElement getNoContent() {
        return driver.findElement(By.id("no-content"));
    }


    public WebElement getMoved() {
        return driver.findElement(By.id("moved"));
    }

    public WebElement getBadRequest() {
        return driver.findElement(By.id("bad-request"));
    }

    public WebElement getUnauthorized() {
        return driver.findElement(By.id("unauthorized"));
    }

    public WebElement getForbiden() {
        return driver.findElement(By.id("forbidden"));
    }

    public WebElement getNotFound() {
        return driver.findElement(By.id("invalid-url"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.id("linkResponse"));
    }
    //metode

    List<WebElement> getlinkResponse(){
        return driver.findElements(By.id("linkResponse"));
    }

    public void clickOnCreated(){
        getCreated().click();
    }


}
