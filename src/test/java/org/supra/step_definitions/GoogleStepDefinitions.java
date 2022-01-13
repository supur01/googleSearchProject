package org.supra.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.supra.pages.GoogleHomePage;
import org.supra.utilities.BrowserUtils;


import java.util.List;

public class GoogleStepDefinitions {

    GoogleHomePage homePage = new GoogleHomePage();

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {

        homePage.getGoogleHomePage();
        homePage.assertGoogleHomePage();

    }
    @Then("User searches for the following")
    public void user_searches_for_the_following(List<String>items) {

        System.out.println("item :"+ items);

        for(String eachItem: items){
            homePage.searchBar.clear();
            homePage.searchBar.sendKeys(eachItem + Keys.ENTER);
            BrowserUtils.sleep(1);
        }

    }

}
