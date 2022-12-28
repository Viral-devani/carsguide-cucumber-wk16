package com.carsguide.cucumber.steps;

import com.carsguide.pages.CarDealersPage;
import com.carsguide.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CarDealersSteps {
    @And("^I click \"([^\"]*)\"$")
    public void iClick(String dealer) throws InterruptedException {
        new HomePage().clickOnSearchCarsLink(dealer);
    }

    @Then("^I navigate to 'car dealer page'$")
    public void iNavigateToCarDealerPage() {
    }

    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealer)  {
        new CarDealersPage().verifyDealersName(dealer);

    }
}
