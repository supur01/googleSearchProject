package org.supra.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.supra.utilities.ConfigurationReader;
import org.supra.utilities.Driver;

public class GoogleHomePage {

    public GoogleHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "q")
    public WebElement searchBar;

    public void getGoogleHomePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
    }

    public void assertGoogleHomePage(){
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Google Home Page is not displayed", expectedTitle,actualTitle);
    }


}
