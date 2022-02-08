package BaseDemoPaket;

import PagesDemoQA.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String HomeURL;
    //DODAJ SVE STRANICE
    public FrontPage frontPage;
    public ElementsPage elementsPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTables webTables;
    public LinksPage linksPage;
    public PracticeForms practiceForms;
    public Alerts alerts;



    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader = new ExcelReader("C:\\Users\\Mirkoni\\Desktop\\DemoQA.xlsx");
        HomeURL = excelReader.getStringData("URL",0,0);
        //STRANICEEE
        frontPage = new FrontPage(driver,wdwait);
        elementsPage = new ElementsPage(driver,wdwait);
        textBoxPage = new TextBoxPage(driver,wdwait);
        checkBoxPage = new CheckBoxPage(driver,wdwait);
        radioButtonPage = new RadioButtonPage(driver,wdwait);
        webTables = new WebTables(driver,wdwait);
        linksPage = new LinksPage(driver,wdwait);
        practiceForms = new PracticeForms(driver,wdwait);
        alerts = new Alerts(driver,wdwait);



    }

    public void scrollDown(WebElement element){

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void click (WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }


    @AfterClass
    public void tearDown(){
       /* driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();*/
    }
}
