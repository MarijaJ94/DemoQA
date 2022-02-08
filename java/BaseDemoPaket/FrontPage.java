package BaseDemoPaket;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FrontPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement elements;
    WebElement forms;
    WebElement alerts;
    WebElement widgets;
    WebElement interactions;
    WebElement bookStore;

    public FrontPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    public List<WebElement> getCards(){
        return driver.findElements(By.className("card-up"));
    }
    public void clickOnElement(int n){
        getCards().get(n).click();
    }


    public List<WebElement>getMenu(){
        return driver.findElements(By.cssSelector(".btn.btn-light "));
    }
    public void clickOnItemInTheMenu(int n){
        getMenu().get(n).click();
    }





  /*  public WebElement getElements() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]"));
    }

    public WebElement getForms() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]"));
    }

    public WebElement getAlerts() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div"));
    }

    public WebElement getWidgets() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]"));
    }

    public WebElement getInteractions() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]"));
    }

    public WebElement getBookStore() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[1]"));
    }
    //metode
    public void clickOnElements(){
        getElements().click();
    }
    public void clickOnForms(){
        getForms().click();
    }
    public void clickOnAlerts(){
        getAlerts().click();
    }
    public void clickOnWidgets(){
        getWidgets().click();
    }
    public void clikOnInteraction(){
        getInteractions().click();
    }
    public void clickOnBookStore(){
        getBookStore().click();
    }*/


}
