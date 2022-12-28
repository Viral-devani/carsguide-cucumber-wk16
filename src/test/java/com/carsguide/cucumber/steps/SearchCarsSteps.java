package com.carsguide.cucumber.steps;

import com.carsguide.pages.HomePage;
import com.carsguide.pages.SearchCarPage;
import com.carsguide.pages.UsedCarsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCarsSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().iMouseHoverOnBuySellTab();
    }

    @And("^I click \"([^\"]*)\" link$")
    public void iClickLink(String selection) throws InterruptedException {
        new HomePage().clickOnSearchCarsLink(selection);

    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
    }


    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String carlist) throws InterruptedException {
        new SearchCarPage().selectCarModel(carlist);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) throws InterruptedException {
        new SearchCarPage().selectModel(model);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) throws InterruptedException {
        new SearchCarPage().selectLocation(location);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) throws InterruptedException {
        new SearchCarPage().selectPrice(price);

    }

    @And("^I click on find my next car tab$")
    public void iClickOnFindMyNextCarTab() {
        new SearchCarPage().clickOnFindMyNewCar();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String carlist) throws InterruptedException {
        new SearchCarPage().verifySearch(carlist);

    }




    @And("^I click on \"([^\"]*)\" car link$")
    public void iClickOnCarLink(String selection1)throws InterruptedException {
        new HomePage().clickOnSearchCarsLink(selection1);

    }

    @Then("^I navigate to 'used cars for sale' page$")
    public void iNavigateToUsedCarsForSalePage() {
    }

    @And("^I select make \"([^\"]*)\" in used car$")
    public void iSelectMakeInUsedCar(String carlist) throws InterruptedException{
        new UsedCarsPage().selectCarModel(carlist);

    }

    @And("^I select model \"([^\"]*)\" in used car$")
    public void iSelectModelInUsedCar(String model) throws InterruptedException {
        new SearchCarPage().selectModel(model);

    }

    @And("^I select location \"([^\"]*)\" in used car$")
    public void iSelectLocationInUsedCar(String location) throws InterruptedException {
        new SearchCarPage().selectLocation(location);

    }

    @And("^I select price \"([^\"]*)\"in used car$")
    public void iSelectPriceInUsedCar(String price) throws InterruptedException  {
        new SearchCarPage().selectPrice(price);

    }
}