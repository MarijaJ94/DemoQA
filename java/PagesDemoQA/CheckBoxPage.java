package PagesDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement homeCheckBox;

    public CheckBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getHomeCheckBox() {
        return driver.findElement(By.className("rct-checkbox"));
    }
    //metode----------------------------------------------
    public void checkCheckBox(){

        getHomeCheckBox().click();
    }
}
