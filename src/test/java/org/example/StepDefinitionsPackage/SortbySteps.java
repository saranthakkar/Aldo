package org.example.StepDefinitionsPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Sortbyby;

public class SortbySteps {
    Sortbyby sortbyby = new Sortbyby();

    @Given("^user is on result page of loafers$")
    public void user_is_on_result_page_of_loafers() throws Throwable {
    }

    @When("^user clicks on Price\\(high to low\\)$")
    public void user_clicks_on_Price_high_to_low() throws Throwable {
    sortbyby.relevanceSelectClass();
    }

    @Then("^user should be able to see all products by the order of price\\(high to low\\)$")
    public void user_should_be_able_to_see_all_products_by_the_order_of_price_high_to_low() throws Throwable {
    sortbyby.scrollBy();
    }
}
