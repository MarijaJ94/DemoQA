package PagesDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebTables {
    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement addButton;
    WebElement firstName;
    WebElement lastName;
    WebElement email;
    WebElement age;
    WebElement salary;
    WebElement department;
    WebElement submitButton;
    WebElement searchField;
    WebElement editButton;
    WebElement deliteButton;
    WebElement firstNameInEditSection;

   public List<WebElement> getRow(){
       return driver.findElements(By.className("rt-tr-group"));
   }



    public WebTables(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAge() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalary() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartment() {
        return driver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getSearchField() {
        return driver.findElement(By.id("searchBox"));
    }

    public WebElement getEditButton() {
        return driver.findElement(By.id("edit-record-1"));
    }

    public WebElement getDeliteButton() {
        return deliteButton;
    }

    public WebElement getFirstNameInEditSection() {
        return driver.findElement(By.id("firstName"));
    }

    public void clickOnAddButton(){
        getAddButton().click();
    }
    public void inputFirstName(String name){
        getFirstName().click();
        getFirstName().clear();
        getFirstName().sendKeys(name);
    }

    public void inputLastName(String lastName){
        getLastName().click();
        getLastName().clear();
        getLastName().sendKeys(lastName);
    }
    public void inputEmail(String mail){
        getEmail().click();
        getEmail().clear();
        getEmail().sendKeys(mail);
    }
        public void inputAge(String n){
        getAge().click();
        getAge().clear();
        getAge().sendKeys("n");
    }
    public void inputDepartment(String name){
        getDepartment().click();
        getDepartment().clear();
        getDepartment().sendKeys(name);
    }

    public void clickOnSubmitButton(){
        getSubmitButton().click();
    }

    public void inputDataInSerachField(String name){
        getSearchField().click();
        getSearchField().clear();
        getSearchField().sendKeys(name);
    }

    public void textFromTableCell(int n){
        getRow().get(n).getText();
    }
    public void clickOnEditButton(){
        getEditButton().click();
    }
    public void editFirstName(String name){
        getFirstNameInEditSection().click();
        getFirstNameInEditSection().clear();
        getFirstName().sendKeys(name);
    }




}
