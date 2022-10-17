package com.browserstack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class BasePage {
    public WebDriver driver;
    public Wait<WebDriver> fluentWait;
}
