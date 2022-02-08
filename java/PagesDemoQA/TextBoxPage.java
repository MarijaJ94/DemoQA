package PagesDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement fullName;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submitButton;


    public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }
    //metode-----------------------------------------------------
    public void clickOnTextBoxAndInputFullName(String username){

        getFullName().click();
        getFullName().clear();
        getFullName().sendKeys(username);

    }
    public void inputEmail (String email){


        getEmail().click();
        getEmail().clear();
        getEmail().sendKeys(email);
    }

    public void inputCurrentAddress(String address){

        getCurrentAddress().click();
        getCurrentAddress().clear();
        getCurrentAddress().sendKeys(address);
    }
    public void inputPermanentAddress(String addres){

        getPermanentAddress().click();
        getPermanentAddress().clear();
        getPermanentAddress().sendKeys(addres);
    }
    public void clickOnSubmittButton(){
        getSubmitButton().click();
    }

}
