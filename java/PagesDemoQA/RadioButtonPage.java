package PagesDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement yesButton;
    WebElement impressiveRadioButton;
    WebElement noButton;
    WebElement message;
    WebElement title;

    public RadioButtonPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getYesButton() {
        //return driver.findElement(By.id("yesRadio"));
        return driver.findElement(By.cssSelector("#yesRadio"));
    }

    public WebElement getImpressiveRadioButton() {
        return driver.findElement(By.cssSelector(".custom-control.custom-radio.custom-control-inline"));

    }

    public WebElement getNoButton() {
        return driver.findElement(By.cssSelector(".custom-control-input.disabled"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.className("mt-3"));
    }

    public WebElement getTitle() {
        return driver.findElement(By.className("main-header"));
    }
    //metode-----------------------------------------------------

    public void clickOnYesRadioButton(){

        getYesButton().click();
    }

    public void clickOnImpressiveRadioButton(){

        getImpressiveRadioButton().click();
    }
    public void clickOnNoRadioButton(){
        getNoButton().click();
    }

}
