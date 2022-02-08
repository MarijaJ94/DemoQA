package PagesDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Alerts {
    public WebDriver driver;
    public WebDriverWait wdwait;
    //elementi

    WebElement browserWindows;
    WebElement newTab;
    WebElement newWindow;
    WebElement newWindowMessage;


    public Alerts(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    //geteri

    public WebElement getBrowserWindows() {
        return driver.findElement(By.id("item-1"));
    }


    //metode
    public void clickOnBrowserWindows(){
        getBrowserWindows().click();
    }

}
