package PagesDemoQA;

import BaseDemoPaket.BasePage;
import BaseDemoPaket.FrontPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementsPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement elements;
    WebElement textBox;
    WebElement checkBox;
    WebElement radioButton;
    WebElement webTables;
    WebElement buttons;
    //moras da ubacis scroll
    WebElement links;
    WebElement brokenLinks;
    WebElement uploadAndDownload;
    WebElement dynamicProperties;


    public ElementsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public List<WebElement> getCards(){
        return driver.findElements(By.className("element-group"));
    }


    public void clickOnElement(int n){
        getCards().get(n).click();
    }
    public void scroolToElement(int n){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
        getCards().get(n).click();
    }



    public WebElement getTextBox() {
        return driver.findElement(By.id("item-0"));
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.id("item-1"));
    }

    public WebElement getRadioButton() {
        return driver.findElement(By.id("item-2"));
    }

    public WebElement getWebTables() {
        return driver.findElement(By.id("item-3"));
    }

    public WebElement getButtons() {
        return driver.findElement(By.id("item-4"));
    }

    public WebElement getLinks() {
        return driver.findElement(By.id("item-5"));
    }

    public WebElement getBrokenLinks() {
        return driver.findElement(By.id("item-6"));
    }

    public WebElement getUploadAndDownload() {
        return driver.findElement(By.id("item-7"));
    }

    public WebElement getDynamicProperties() {
        return driver.findElement(By.id("item-8"));
    }
    //metode.................................................................
    /*public void clickOnElements(int broj){
        elementsList.get(broj).click();
    }*/




    //TextBox--------------------------------------
    public void clickOnTextBox(){
        getTextBox().click();
    }
    public void clickOnCheckBox(){
        getCheckBox().click();
    }
    public void clickOnRadioButton(){
        getRadioButton().click();
    }
    public void clickOnWebTables(){
        getWebTables().click();
    }
    public void clickOnButtons(){
        getButtons().click();
    }
    public void clickOnLinks(){
        getLinks().click();
    }
    public void clickOnBrokenLinks(){
        getBrokenLinks().click();
    }
    public void clickOnUploadAnaDownload(){
        getUploadAndDownload().click();
    }
    public void clickOnDynamicProperties(){
        getDynamicProperties().click();
    }



}
