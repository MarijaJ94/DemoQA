package PagesDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PracticeForms {
    public WebDriver driver;
    public WebDriverWait wdwait;
    //elementi
    WebElement practiceFormSection;
    WebElement firstName;
    WebElement lastName;
    WebElement email;
    WebElement genderRadioButton;

    WebElement dateOfBirth;
    WebElement subjects;
    WebElement hobbies;
    WebElement currentAddress;
    WebElement state;
    WebElement city;
    WebElement submitButton;
    WebElement year;

    public PracticeForms(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public Select getYear() {
        return new Select(driver.findElement(By.className("react-datepicker__year-select")));
    }

    public WebElement getPracticeFormSection() {
        return driver.findElement(By.cssSelector(".element-list.collapse.show"));
                /*cssSelector(".element-list.collapse.show"));*/
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

    public WebElement getGenderRadioButton() {
        return driver.findElement(By.id("gender-radio-2"));
    }

    public WebElement getDateOfBirth(){
        return driver.findElement(By.id("dateOfBirthInput"));
    }


    public List<WebElement> getMonth(){
        return driver.findElements(By.className("react-datepicker__month-select"));
    }
    public void pickMonth(int n){
        getMonth().get(n).click();
    }



    public WebElement getSubjects() {
        return driver.findElement(By.id("subjectsContainer"));
    }

    List<WebElement> getCheckBox(){
        return driver.findElements(By.className("custom-control-input"));
    }

    public WebElement getHobbies() {
        return driver.findElement(By.id("hobbies-checkbox-2"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getState() {
        return driver.findElement(By.id("state"));
    }
    public WebElement getStateNCR(){
        return  driver.findElement(By.cssSelector(".css-1uccc91-singleValue"));
    }

    public WebElement getCity() {
        return driver.findElement(By.id("city"));
    }
    public WebElement selectCity(){
        return  driver.findElement(By.cssSelector(".css-1uccc91-singleValue"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }
    //metode

    public void clickOnPracticeForms(){
        getPracticeFormSection().click();
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
    List<WebElement>getGenderButton(){
        return driver.findElements(By.name("gender"));
    }

    public void clickOnFemaleRadioButton(int n){
        getGenderButton().get(n).click();
    }

    public void clickOnDateOfBirth(){
        getDateOfBirth().click();
    }

    public void pickYear(){

        getYear().selectByVisibleText("1994");
    }
    public void inputSubjects(String subject){
        getSubjects().click();
        getSubjects().clear();
        getSubjects().sendKeys(subject);
    }
    public void clickOnCheckBox(int n){
        getCheckBox().get(n).click();
    }


    public void clickOnReading(){
        getHobbies().click();
    }



}
