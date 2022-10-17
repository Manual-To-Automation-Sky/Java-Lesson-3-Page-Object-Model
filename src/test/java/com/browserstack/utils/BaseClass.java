package com.browserstack.utils;

import com.browserstack.pages.ContactUsPage;
import com.browserstack.pages.HomePage;
import com.browserstack.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;

public class BaseClass {
    public WebDriver driver;

    // Page Object Instances
    public HomePage homePage;
    public ContactUsPage contactUsPage;
    public LoginPage loginPage;

    // Contact Us Test Strings
    public String contactUsUrl = "https://automationexercise.com";
    public String name = "Firstname Lastname";
    public String emailAddress = "test@email.com";
    public String subjectText = "The Subject";
    public String messageText = "This is the content of the message text";

    // Login Test Strings
    public String url = "https://practicetestautomation.com/practice-test-login/";
    public String username = "student";
    public String password = "Password123";
    public String wrongUsername = "wrong-student";
    public String wrongPassword = "Password456";


    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        driver = new RemoteWebDriver(
                new URL("https://hub.browserstack.com/wd/hub"), capabilities);

        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        loginPage = new LoginPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
