package scripts;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.DiscoverHomePage;
import utilities.Driver;

public class Base {

    WebDriver driver;
    Faker faker;
    DiscoverHomePage discoverHomePage;


    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        faker = new Faker();
        discoverHomePage = new DiscoverHomePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
