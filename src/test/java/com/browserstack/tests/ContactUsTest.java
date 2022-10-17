package com.browserstack.tests;

import com.browserstack.utils.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseClass {

    @Test
    public void fillContactForm() {
        driver.get(contactUsUrl);

        homePage.goToContactUsPage();

        contactUsPage.fillContactForm(name, emailAddress, subjectText, messageText);

        Assert.assertTrue(contactUsPage.getSuccessMessageElement().isDisplayed());
    }

}
