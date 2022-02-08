package TestsDemoQA;

import BaseDemoPaket.BasePage;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestsForDemo extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }

    @Test
    public void verifyThatUserCanInputTextInFullNameField(){
        frontPage.clickOnElement(0);
        elementsPage.clickOnElement(0);
        elementsPage.clickOnTextBox();

        textBoxPage.clickOnTextBoxAndInputFullName(excelReader.getStringData("TextBox",1,0));

        textBoxPage.inputEmail(excelReader.getStringData("TextBox",1,1));
        textBoxPage.inputCurrentAddress(excelReader.getStringData("TextBox",1,2));
        textBoxPage.inputPermanentAddress(excelReader.getStringData("TextBox",1,3));
        scrollDown(driver.findElement(By.id("submit")));
        textBoxPage.clickOnSubmittButton();

        WebElement output = driver.findElement(By.id("output"));
        Assert.assertTrue(output.isDisplayed());
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demoqa.com/text-box";
        Assert.assertEquals(actualURL,expectedURL);
    }
    @Test
    public void verifyThatWhenUserClicksOnHomeCheckBoxYouHaveSelectedAppears(){
        frontPage.clickOnElement(0);
        elementsPage.clickOnElement(0);

        elementsPage.clickOnCheckBox();
        checkBoxPage.checkCheckBox();

        WebElement youHaveSelected = driver.findElement(By.id("result"));
        Assert.assertTrue(youHaveSelected.isDisplayed());
        String actualURL= driver.getCurrentUrl();
        String expectedURL= "https://demoqa.com/checkbox";
        Assert.assertEquals(actualURL,expectedURL);

    }
    @Test // problem je sto sada test prolazi, kada se trazi preko nekog drugog selektora bez obzira sto postoji "klik" metoda, program klikne ali test pada :/
    public void verifyThatUserCanCheckYesRadioButton(){
        frontPage.clickOnElement(0);
        elementsPage.clickOnElement(0);
        elementsPage.clickOnRadioButton();

       // radioButtonPage.clickOnYesRadioButton();

        click(driver.findElement(By.cssSelector("#yesRadio")));

        Assert.assertTrue(radioButtonPage.getMessage().isDisplayed());

        String expectedTitle = "Radio Button";
        String actualTitle = driver.findElement(By.className("main-header")).getText();
        Assert.assertEquals(actualTitle,expectedTitle);
        Assert.assertTrue(radioButtonPage.getTitle().isDisplayed());

        Assert.assertTrue(radioButtonPage.getMessage().isDisplayed());
        String message = "You have selected Yes";
        System.out.println(radioButtonPage.getMessage().getText());
        String expectedMessage = radioButtonPage.getMessage().getText();
        Assert.assertEquals(message,expectedMessage);

    }
    @Test
    public void verifyThatUserCanClickOnImmpresiveRadioButton(){
        frontPage.clickOnElement(0);
        elementsPage.clickOnElement(0);
        elementsPage.clickOnRadioButton();
        radioButtonPage.clickOnImpressiveRadioButton();

        click(driver.findElement(By.id("impressiveRadio")));
        Assert.assertTrue(radioButtonPage.getMessage().isDisplayed());

        String expectedTitle = "Radio Button";
        String actualTitle = driver.findElement(By.className("main-header")).getText();
        Assert.assertEquals(actualTitle,expectedTitle);
        Assert.assertTrue(radioButtonPage.getTitle().isDisplayed());

        Assert.assertTrue(radioButtonPage.getMessage().isDisplayed());
        String message = "You have selected Impressive";
        System.out.println(radioButtonPage.getMessage().getText());
        String expectedMessage = radioButtonPage.getMessage().getText();
        Assert.assertEquals(message,expectedMessage);


    }
    @Test //nisam sigurna da li je dobro test pada ,to je ok, ali se ne vidi kada likne
    public void verifyThatUserCanClickOnNoRadioButton(){
        frontPage.clickOnElement(0);
        elementsPage.clickOnElement(0);
        elementsPage.clickOnRadioButton();

        radioButtonPage.clickOnNoRadioButton();
      //  click(driver.findElement(By.id("noRadio")));
    }

    @Test
    public void verifyThatUserCanAddNewEmloyeeInWebTable(){
        frontPage.clickOnElement(0);
        elementsPage.clickOnElement(0);
        elementsPage.clickOnWebTables();
        webTables.clickOnAddButton();
        String name = excelReader.getStringData("WebTables",1,0);
        webTables.inputFirstName(name);

        String lastName = excelReader.getStringData("WebTables",1,1);
        webTables.inputLastName(lastName);

        String mail = excelReader.getStringData("WebTables",1,2);
        webTables.inputEmail(mail);

        WebElement age = driver.findElement(By.id("age"));
        age.click();
        age.sendKeys("31");

        WebElement salary = driver.findElement(By.id("salary"));
        salary.click();
        salary.sendKeys("3000");

        String departmentName = excelReader.getStringData("WebTables",1,5);
        webTables.inputDepartment(departmentName);

        webTables.clickOnSubmitButton();

        String row = driver.findElement(By.cssSelector(".rt-tr.-even")).getText();
        System.out.println(row);


    }
    @Test
    public void verifyThatUserCanSearchThroughtTheSearchField(){
        frontPage.clickOnElement(0);
        elementsPage.clickOnElement(0);
        elementsPage.clickOnWebTables();
        String nameFromTabel = excelReader.getStringData("WebTables",2,0);
        webTables.inputDataInSerachField(nameFromTabel);
        webTables.textFromTableCell(0);

    }
    @Test
    public void verifyThatUserCanEditTable(){
        frontPage.clickOnElement(0);
        elementsPage.clickOnElement(0);
        elementsPage.clickOnWebTables();
        webTables.clickOnEditButton();
        String editFirstName = excelReader.getStringData("EditTable",1,0);
        webTables.editFirstName(editFirstName);
        webTables.clickOnSubmitButton();
        webTables.textFromTableCell(0);

        String firstRowName = driver.findElement(By.className("rt-td")).getText();
        String validName = "Pera";
        Assert.assertEquals(firstRowName,validName);
        System.out.println(firstRowName);


    }
    @Test
    public void verifyThatClicksOnSpecificLinkShowsCorrectMessage() throws InterruptedException {
        frontPage.clickOnElement(0);
        elementsPage.clickOnElement(0);
        scrollDown(driver.findElement(By.id("item-5")));
        elementsPage.clickOnLinks();
        linksPage.clickOnCreated();
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("linkResponse")));

        String actualMassege = linksPage.getMessage().getText();
        String validTextForCreated = "Link has responded with staus 201 and status text Created";

        Assert.assertEquals(actualMassege,validTextForCreated);

        String titleOfPage = driver.findElement(By.className("main-header")).getText();
        String expectedTitle = "Links";

        Assert.assertEquals(titleOfPage,expectedTitle);



    }
    @Test
    public void verifyThatUserCanFulfillPracticeForm(){
        frontPage.clickOnElement(1);

        practiceForms.clickOnPracticeForms();

        String firstName = excelReader.getStringData("Practice Form",1,0);
        practiceForms.inputFirstName(firstName);

        String lastName = excelReader.getStringData("Practice Form",1,1);
        practiceForms.inputLastName(lastName);

        String mail = excelReader.getStringData("Practice Form",1,2);

        practiceForms.inputEmail(mail);

       // practiceForms.clickOnFemaleRadioButton(1);



        WebElement phoneNumber = driver.findElement(By.id("userNumber"));
        phoneNumber.sendKeys("1233566111");

       /* practiceForms.clickOnDateOfBirth();
        practiceForms.pickMonth(1);
        practiceForms.pickYear();
        WebElement subjects = driver.findElement(By.id("subjectsContainer"));
        subjects.sendKeys("e");
        subjects.sendKeys(Keys.ENTER);

        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("hobbies-checkbox-2")));
        practiceForms.clickOnReading();*/


    }



}
